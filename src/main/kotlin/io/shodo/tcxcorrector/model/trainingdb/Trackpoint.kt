//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.09.09 at 12:20:23 PM MDT 
//
package io.shodo.tcxcorrector.model.trainingdb

import java.math.BigDecimal
import jakarta.xml.bind.annotation.XmlAccessType
import jakarta.xml.bind.annotation.XmlAccessorType
import jakarta.xml.bind.annotation.XmlElement
import jakarta.xml.bind.annotation.XmlRootElement
import jakarta.xml.bind.annotation.XmlType
import javax.xml.datatype.XMLGregorianCalendar

/**
 *
 * Java class for anonymous complex type.
 *
 *
 * The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType>
 * &lt;complexContent>
 * &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 * &lt;sequence>
 * &lt;element ref="{http://www.garmin.com/xmlschemas/TrainingCenterDatabase/v2}Time"/>
 * &lt;element ref="{http://www.garmin.com/xmlschemas/TrainingCenterDatabase/v2}Position" minOccurs="0"/>
 * &lt;element ref="{http://www.garmin.com/xmlschemas/TrainingCenterDatabase/v2}AltitudeMeters" minOccurs="0"/>
 * &lt;element ref="{http://www.garmin.com/xmlschemas/TrainingCenterDatabase/v2}DistanceMeters" minOccurs="0"/>
 * &lt;element ref="{http://www.garmin.com/xmlschemas/TrainingCenterDatabase/v2}HeartRateBpm" minOccurs="0"/>
 * &lt;element ref="{http://www.garmin.com/xmlschemas/TrainingCenterDatabase/v2}Extensions" minOccurs="0"/>
 * &lt;/sequence>
 * &lt;/restriction>
 * &lt;/complexContent>
 * &lt;/complexType>
</pre> *
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = ["time", "position", "altitudeMeters", "distanceMeters", "heartRateBpm", "extensions"])
@XmlRootElement(name = "Trackpoint")
class Trackpoint {
    /**
     * Gets the value of the time property.
     *
     * @return
     * possible object is
     * [XMLGregorianCalendar]
     */
    /**
     * Sets the value of the time property.
     *
     * @param value
     * allowed object is
     * [XMLGregorianCalendar]
     */
    @XmlElement(name = "Time", required = true)
    lateinit var time: XMLGregorianCalendar
    /**
     * Gets the value of the position property.
     *
     * @return
     * possible object is
     * [Position]
     */
    /**
     * Sets the value of the position property.
     *
     * @param value
     * allowed object is
     * [Position]
     */
    @XmlElement(name = "Position")
    lateinit var position: Position
    /**
     * Gets the value of the altitudeMeters property.
     *
     * @return
     * possible object is
     * [BigDecimal]
     */
    /**
     * Sets the value of the altitudeMeters property.
     *
     * @param value
     * allowed object is
     * [BigDecimal]
     */
    @XmlElement(name = "AltitudeMeters")
    var altitudeMeters: BigDecimal? = null

    @XmlElement(name = "DistanceMeters")
    var distanceMeters: String? = null
    /**
     * Gets the value of the heartRateBpm property.
     *
     * @return
     * possible object is
     * [HeartRateBpm]
     */
    /**
     * Sets the value of the heartRateBpm property.
     *
     * @param value
     * allowed object is
     * [HeartRateBpm]
     */
    @XmlElement(name = "HeartRateBpm")
    var heartRateBpm: HeartRateBpm? = null
    /**
     * Gets the value of the extensions property.
     *
     * @return
     * possible object is
     * [Extensions]
     */
    /**
     * Sets the value of the extensions property.
     *
     * @param value
     * allowed object is
     * [Extensions]
     */
    @XmlElement(name = "Extensions")
    var extensions: Extensions? = null

}