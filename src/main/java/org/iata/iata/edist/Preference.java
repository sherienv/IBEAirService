//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.06.16 at 03:34:45 PM IST 
//


package org.iata.iata.edist;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element ref="{http://www.iata.org/IATA/EDIST}CabinPreferences"/>
 *         &lt;element ref="{http://www.iata.org/IATA/EDIST}FarePreferences"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "cabinPreferences",
    "farePreferences"
})
@XmlRootElement(name = "Preference")
public class Preference {

    @XmlElement(name = "CabinPreferences")
    protected CabinPreferences cabinPreferences;
    @XmlElement(name = "FarePreferences")
    protected FarePreferences farePreferences;

    /**
     * Gets the value of the cabinPreferences property.
     * 
     * @return
     *     possible object is
     *     {@link CabinPreferences }
     *     
     */
    public CabinPreferences getCabinPreferences() {
        return cabinPreferences;
    }

    /**
     * Sets the value of the cabinPreferences property.
     * 
     * @param value
     *     allowed object is
     *     {@link CabinPreferences }
     *     
     */
    public void setCabinPreferences(CabinPreferences value) {
        this.cabinPreferences = value;
    }

    /**
     * Gets the value of the farePreferences property.
     * 
     * @return
     *     possible object is
     *     {@link FarePreferences }
     *     
     */
    public FarePreferences getFarePreferences() {
        return farePreferences;
    }

    /**
     * Sets the value of the farePreferences property.
     * 
     * @param value
     *     allowed object is
     *     {@link FarePreferences }
     *     
     */
    public void setFarePreferences(FarePreferences value) {
        this.farePreferences = value;
    }

}