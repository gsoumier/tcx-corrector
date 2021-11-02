package io.shodo.tcxcorrector

import org.assertj.core.api.Assertions
import org.junit.jupiter.api.Test

internal class TcxFileHandlerTest {

    @Test
    fun `should load complete tcx xml file`() {

        val jaxbTcxFileHandler = JaxbTcxFileHandler()
        val trainingCenterDatabase =
            jaxbTcxFileHandler.load("/home/germain/IdeaProjects/tcx-file-checker/src/test/resources/activity_2.tcx")
        Assertions.assertThat(trainingCenterDatabase).isNotNull
        jaxbTcxFileHandler.write(trainingCenterDatabase, "/home/germain/IdeaProjects/tcx-file-checker/src/test/resources/activity_2_unmarshal_marshal.tcx")
        JsonTcxFileWriter().write(trainingCenterDatabase, "/home/germain/IdeaProjects/tcx-file-checker/src/test/resources/activity_2.json")

    }
}