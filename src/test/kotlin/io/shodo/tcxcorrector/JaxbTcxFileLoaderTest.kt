package io.shodo.tcxcorrector

import org.assertj.core.api.Assertions
import org.junit.jupiter.api.Test

internal class JaxbTcxFileLoaderTest {

    @Test
    fun `should load complete tcx xml file`() {

        val trainingCenterDatabase =
            JaxbTcxFileLoader().load("/home/germain/IdeaProjects/tcx-file-checker/src/test/resources/activity_2.tcx")
        Assertions.assertThat(trainingCenterDatabase).isNotNull
    }
}