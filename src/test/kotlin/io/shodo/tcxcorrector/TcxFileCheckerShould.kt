package io.shodo.tcxcorrector

import io.shodo.tcxcorrector.TcxFileChecker
import org.junit.Test
import java.time.LocalDateTime

class TcxFileCheckerShould {

    @Test
    fun `create a new file for correction`() {
        val tcxFileChecker = TcxFileChecker("/home/germain/Documents/activity.tcx")
        tcxFileChecker.saveCorrectionAs("/home/germain/Documents/activity_fixed.tcx")
    }

    @Test
    fun `call corrections`() {

        val tcxFileChecker = TcxFileChecker("/home/germain/IdeaProjects/tcx-file-checker/src/test/resources/activity.tcx")
            tcxFileChecker.fixBetween(
                LocalDateTime.of(2020, 9, 22, 15, 43),
                LocalDateTime.of(2020, 9, 22, 15, 50)
            )
        tcxFileChecker.saveCorrectionAs("/home/germain/IdeaProjects/tcx-file-checker/src/test/resources/activity_fixed.tcx")

    }

}
