package io.shodo.tcxcorrector

import com.fasterxml.jackson.databind.ObjectMapper
import io.shodo.tcxcorrector.model.trainingdb.TrainingCenterDatabase
import java.io.File

class JsonTcxFileWriter : TcxFileWriter {
    private val mapper = ObjectMapper()

    override fun write(trainingCenterDatabase: TrainingCenterDatabase, filePath: String) {
        mapper.writeValue(File(filePath), trainingCenterDatabase)
    }
}