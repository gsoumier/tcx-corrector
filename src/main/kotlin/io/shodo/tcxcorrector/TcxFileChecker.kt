package io.shodo.tcxcorrector

import org.w3c.dom.Document
import org.w3c.dom.Node
import java.io.File
import java.time.LocalDateTime
import javax.xml.parsers.DocumentBuilderFactory
import javax.xml.transform.Transformer
import javax.xml.transform.TransformerFactory
import javax.xml.transform.dom.DOMSource
import javax.xml.transform.stream.StreamResult


class TcxFileChecker(fileName: String) {

    private val doc = parseDocument(fileName)

    private fun parseDocument(fileName: String): Document {
        return DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(File(fileName))
    }

    fun saveCorrectionAs(exportFilePath: String) {
        val transformerFactory = TransformerFactory.newInstance()
        val transformer: Transformer = transformerFactory.newTransformer()
        val source = DOMSource(doc)
        val result = StreamResult(File(exportFilePath))
        transformer.transform(source, result)
    }

    fun fixBetween(from: LocalDateTime, to: LocalDateTime) {
        val trackPoints = doc.getElementsByTagName("Trackpoint")
        var lastNodeToKeep: Node? = null
        var firstNodeToKeep: Node? = null
        val nodesToRemove = mutableListOf<Node>()
        for (i: Int in 0..trackPoints.length) {
            val currentNode = trackPoints.item(i)
            val pointTime = LocalDateTime.parse(currentNode.childNodes.item(0).textContent)
            if (pointTime.isBefore(from))
                lastNodeToKeep = currentNode
            if (pointTime.isAfter(to) && firstNodeToKeep == null)
                firstNodeToKeep = currentNode
            if (!pointTime.isBefore(from) && !pointTime.isAfter(to)){
                nodesToRemove.add(currentNode)
            }
        }
        nodesToRemove.forEach { doc.removeChild(it) }
    }

}
