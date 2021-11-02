package io.shodo.tcxcorrector

import io.mockk.every
import io.mockk.mockk
import io.shodo.tcxcorrector.model.trainingdb.Lap
import io.shodo.tcxcorrector.model.trainingdb.Position
import io.shodo.tcxcorrector.model.trainingdb.Trackpoint
import org.assertj.core.api.Assertions.assertThat
import org.junit.Test
import java.time.LocalDateTime
import javax.xml.datatype.XMLGregorianCalendar

class TcxFileCheckerShould {

    @Test
    fun `create a new file for correction`() {
        val tcxFileChecker = TcxFileChecker("/home/germain/Documents/activity.tcx")
        tcxFileChecker.saveCorrectionAs("/home/germain/Documents/activity_fixed.tcx")
    }

    @Test
    fun should_not_modify_lap_when_two_successive_points_are_concerned() {
        val trackCorrector = TrackCorrector()
        val lap = lap()
        val start = LocalDateTime.of(2020, 10, 21, 16, 13, 21)
        val end = LocalDateTime.of(2020, 10, 21, 16, 13, 22)

        val actual = trackCorrector.fix(lap, start, end)

        assertThat(actual.track.trackpoints).hasSize(80)
    }

    @Test
    fun should_remove_intermediate_points() {
        val trackCorrector = TrackCorrector()
        val lap = lap()
        val start = LocalDateTime.of(2020, 10, 21, 16, 13, 21)
        val end = LocalDateTime.of(2020, 10, 21, 16, 13, 23)

        val actual = trackCorrector.fix(lap, start, end)

        assertThat(actual.track.trackpoints).hasSize(79)
    }
    @Test
    fun should_calculate_replace_distance() {
        val distanceCalculator = mockk<DistanceCalculator>{
            every { distanceBetween(any(), any()) } returns Distance(1000)
        }
        val trackCorrector = TrackCorrector(distanceCalculator)
        val lap = lap()
        val start = LocalDateTime.of(2020, 10, 21, 16, 13, 18)
        val end = LocalDateTime.of(2020, 10, 21, 16, 17, 29)

        val actual = trackCorrector.fix(lap, start, end)

        assertThat(actual.track.trackpoints).hasSize(2)
        assertThat(actual.track.trackpoints[1].distanceMeters).isEqualTo("1000")

    }


    private fun lap(): Lap {
        val trainingCenterDatabase =
            JaxbTcxFileHandler().load("/home/germain/IdeaProjects/tcx-file-checker/src/test/resources/activity_test.tcx")

        return trainingCenterDatabase.activities?.activity?.laps?.get(0) ?: error("my bad!")
    }

    class TrackCorrector(private val distanceCalculator: DistanceCalculator= DistanceCalculator()) {
        fun fix(lap: Lap, start: LocalDateTime, end: LocalDateTime): Lap {
            val trackpoints: List<Trackpoint> = lap.track.trackpoints
            val endTrackpoint = trackpoints.find { it.time.toLocalDateTime() == end }?: error("No trackpoint found at time $end")
            val startTrackpoint = trackpoints.find { it.time.toLocalDateTime() == start }?: error("No trackpoint found at time $start")
            val distance = distanceCalculator.distanceBetween(startTrackpoint.position, endTrackpoint.position)
            endTrackpoint.distanceMeters=distance.formatAsString()
            return lap.apply {
                track.trackpoints = trackpoints.asSequence()
                    .filterNot { it.hasTimeBetween(start, end) }
                    .toList()
            }
        }

        private fun Trackpoint.hasTimeBetween(
            start: LocalDateTime,
            end: LocalDateTime
        ) = time.toLocalDateTime().isBefore(end) && time.toLocalDateTime().isAfter(start)

    }
}

data class Distance(val distanceInMeter: Int) {
    fun formatAsString(): String {
        return distanceInMeter.toString()
    }
}

class DistanceCalculator {
    fun distanceBetween(start: Position, end: Position) : Distance {
        return Distance(1000)
    }


}

private fun XMLGregorianCalendar.toLocalDateTime() =
    toGregorianCalendar().toZonedDateTime().toLocalDateTime()!!

