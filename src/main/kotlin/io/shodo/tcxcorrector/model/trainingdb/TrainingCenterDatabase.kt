//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.09.09 at 12:20:23 PM MDT 
//
package io.shodo.tcxcorrector.model.trainingdb

import jakarta.xml.bind.annotation.*

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = ["activities", "author"])
@XmlRootElement(name = "TrainingCenterDatabase")
class TrainingCenterDatabase {

    @XmlElement(name = "Activities", required = true)
    var activities: Activities? = null

    @XmlElement(name = "Author", required = true)
    var author: Author? = null
}