package io.shodo.tcxcorrector

import io.shodo.tcxcorrector.model.trainingdb.TrainingCenterDatabase
import jakarta.xml.bind.JAXBContext
import jakarta.xml.bind.Marshaller
import java.io.File

class JaxbTcxFileHandler : TcxFileLoader, TcxFileWriter {
    private val jaxbContext = JAXBContext.newInstance(TrainingCenterDatabase::class.java)

    override fun load(filePath: String): TrainingCenterDatabase {
        return jaxbContext.createUnmarshaller().unmarshal(File(filePath)) as TrainingCenterDatabase
    }

    override fun write(trainingCenterDatabase: TrainingCenterDatabase, filePath: String) {
        val marshaller = jaxbContext.createMarshaller()
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true)
        marshaller.marshal(trainingCenterDatabase, File(filePath))
    }
}