package io.shodo.tcxcorrector

import io.shodo.tcxcorrector.model.trainingdb.TrainingCenterDatabase
import jakarta.xml.bind.JAXBContext
import java.io.File

class JaxbTcxFileLoader : TcxFileLoader {
    override fun load(filePath: String): TrainingCenterDatabase {
        val jaxbContext = JAXBContext.newInstance(TrainingCenterDatabase::class.java)
        val createUnmarshaller = jaxbContext.createUnmarshaller()
        return createUnmarshaller.unmarshal(File(filePath)) as TrainingCenterDatabase
    }
}