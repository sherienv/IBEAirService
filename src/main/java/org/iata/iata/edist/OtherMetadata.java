//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.06.17 at 03:52:09 PM IST 
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
 *       &lt;sequence>
 *         &lt;element ref="{http://www.iata.org/IATA/EDIST}AirportMetadatas"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "airportMetadatas"
})
@XmlRootElement(name = "OtherMetadata")
public class OtherMetadata {

    @XmlElement(name = "AirportMetadatas", required = true)
    protected AirportMetadatas airportMetadatas;

    /**
     * Gets the value of the airportMetadatas property.
     * 
     * @return
     *     possible object is
     *     {@link AirportMetadatas }
     *     
     */
    public AirportMetadatas getAirportMetadatas() {
        return airportMetadatas;
    }

    /**
     * Sets the value of the airportMetadatas property.
     * 
     * @param value
     *     allowed object is
     *     {@link AirportMetadatas }
     *     
     */
    public void setAirportMetadatas(AirportMetadatas value) {
        this.airportMetadatas = value;
    }

}
