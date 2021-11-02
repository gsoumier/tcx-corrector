package io.shodo.tcxcorrector

import io.shodo.tcxcorrector.model.trainingdb.TrainingCenterDatabase

interface TcxFileWriter {

    fun write(trainingCenterDatabase : TrainingCenterDatabase, filePath: String)

}