package io.shodo.tcxcorrector

import io.shodo.tcxcorrector.model.trainingdb.TrainingCenterDatabase

interface TcxFileLoader {

    fun load(filePath: String) : TrainingCenterDatabase

}