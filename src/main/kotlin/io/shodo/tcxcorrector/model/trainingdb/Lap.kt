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
import jakarta.xml.bind.annotation.XmlAttribute
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
 * &lt;element ref="{http://www.garmin.com/xmlschemas/TrainingCenterDatabase/v2}TotalTimeSeconds"/>
 * &lt;element ref="{http://www.garmin.com/xmlschemas/TrainingCenterDatabase/v2}DistanceMeters"/>
 * &lt;element ref="{http://www.garmin.com/xmlschemas/TrainingCenterDatabase/v2}MaximumSpeed"/>
 * &lt;element ref="{http://www.garmin.com/xmlschemas/TrainingCenterDatabase/v2}Calories"/>
 * &lt;element ref="{http://www.garmin.com/xmlschemas/TrainingCenterDatabase/v2}AverageHeartRateBpm"/>
 * &lt;element ref="{http://www.garmin.com/xmlschemas/TrainingCenterDatabase/v2}MaximumHeartRateBpm"/>
 * &lt;element ref="{http://www.garmin.com/xmlschemas/TrainingCenterDatabase/v2}Intensity"/>
 * &lt;element ref="{http://www.garmin.com/xmlschemas/TrainingCenterDatabase/v2}TriggerMethod"/>
 * &lt;element ref="{http://www.garmin.com/xmlschemas/TrainingCenterDatabase/v2}Track"/>
 * &lt;element ref="{http://www.garmin.com/xmlschemas/TrainingCenterDatabase/v2}Extensions"/>
 * &lt;/sequence>
 * &lt;attribute name="StartTime" use="required">
 * &lt;simpleType>
 * &lt;restriction base="{http://www.w3.org/2001/XMLSchema}dateTime">
 * &lt;enumeration value="2012-05-19T11:08:07.000Z"/>
 * &lt;enumeration value="2012-05-19T11:17:01.000Z"/>
 * &lt;enumeration value="2012-05-19T11:25:43.000Z"/>
 * &lt;enumeration value="2012-05-19T11:35:20.000Z"/>
 * &lt;enumeration value="2012-05-19T11:43:42.000Z"/>
 * &lt;enumeration value="2012-05-19T11:52:48.000Z"/>
 * &lt;enumeration value="2012-05-19T12:01:28.000Z"/>
 * &lt;enumeration value="2012-05-19T12:09:57.000Z"/>
 * &lt;enumeration value="2012-05-19T12:18:32.000Z"/>
 * &lt;enumeration value="2012-05-19T12:27:20.000Z"/>
 * &lt;enumeration value="2012-05-19T12:36:13.000Z"/>
 * &lt;enumeration value="2012-05-19T12:45:05.000Z"/>
 * &lt;enumeration value="2012-05-19T12:54:01.000Z"/>
 * &lt;enumeration value="2012-05-19T13:03:02.000Z"/>
 * &lt;/restriction>
 * &lt;/simpleType>
 * &lt;/attribute>
 * &lt;/restriction>
 * &lt;/complexContent>
 * &lt;/complexType>
</pre> *
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
    name = "",
    propOrder = ["totalTimeSeconds", "distanceMeters", "maximumSpeed", "calories", "averageHeartRateBpm", "maximumHeartRateBpm", "intensity", "triggerMethod", "track", "extensions"]
)
@XmlRootElement(name = "Lap")
class Lap {
    /**
     * Gets the value of the totalTimeSeconds property.
     *
     * @return
     * possible object is
     * [BigDecimal]
     */
    /**
     * Sets the value of the totalTimeSeconds property.
     *
     * @param value
     * allowed object is
     * [BigDecimal]
     */
    @XmlElement(name = "TotalTimeSeconds", required = true)
    var totalTimeSeconds: BigDecimal? = null
    /**
     * Gets the value of the distanceMeters property.
     *
     * @return
     * possible object is
     * [String]
     */
    /**
     * Sets the value of the distanceMeters property.
     *
     * @param value
     * allowed object is
     * [String]
     */
    @XmlElement(name = "DistanceMeters", required = false)
    var distanceMeters: String? = null
    /**
     * Gets the value of the maximumSpeed property.
     *
     * @return
     * possible object is
     * [BigDecimal]
     */
    /**
     * Sets the value of the maximumSpeed property.
     *
     * @param value
     * allowed object is
     * [BigDecimal]
     */
    @XmlElement(name = "MaximumSpeed", required = true)
    var maximumSpeed: BigDecimal? = null
    /**
     * Gets the value of the calories property.
     *
     */
    /**
     * Sets the value of the calories property.
     *
     */
    @XmlElement(name = "Calories")
    var calories: Byte = 0
    /**
     * Gets the value of the averageHeartRateBpm property.
     *
     * @return
     * possible object is
     * [AverageHeartRateBpm]
     */
    /**
     * Sets the value of the averageHeartRateBpm property.
     *
     * @param value
     * allowed object is
     * [AverageHeartRateBpm]
     */
    @XmlElement(name = "AverageHeartRateBpm", required = true)
    var averageHeartRateBpm: AverageHeartRateBpm? = null
    /**
     * Gets the value of the maximumHeartRateBpm property.
     *
     * @return
     * possible object is
     * [MaximumHeartRateBpm]
     */
    /**
     * Sets the value of the maximumHeartRateBpm property.
     *
     * @param value
     * allowed object is
     * [MaximumHeartRateBpm]
     */
    @XmlElement(name = "MaximumHeartRateBpm", required = true)
    var maximumHeartRateBpm: MaximumHeartRateBpm? = null
    /**
     * Gets the value of the intensity property.
     *
     * @return
     * possible object is
     * [String]
     */
    /**
     * Sets the value of the intensity property.
     *
     * @param value
     * allowed object is
     * [String]
     */
    @XmlElement(name = "Intensity", required = true)
    var intensity: String? = null
    /**
     * Gets the value of the triggerMethod property.
     *
     * @return
     * possible object is
     * [String]
     */
    /**
     * Sets the value of the triggerMethod property.
     *
     * @param value
     * allowed object is
     * [String]
     */
    @XmlElement(name = "TriggerMethod", required = true)
    var triggerMethod: String? = null
    /**
     * Gets the value of the track property.
     *
     * @return
     * possible object is
     * [Track]
     */
    /**
     * Sets the value of the track property.
     *
     * @param value
     * allowed object is
     * [Track]
     */
    @XmlElement(name = "Track", required = true)
    var track: Track? = null
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
    @XmlElement(name = "Extensions", required = true)
    var extensions: Extensions? = null
    /**
     * Gets the value of the startTime property.
     *
     * @return
     * possible object is
     * [XMLGregorianCalendar]
     */
    /**
     * Sets the value of the startTime property.
     *
     * @param value
     * allowed object is
     * [XMLGregorianCalendar]
     */
    @XmlAttribute(name = "StartTime", required = true)
    var startTime: XMLGregorianCalendar? = null
}