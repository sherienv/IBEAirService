//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.06.19 at 04:20:21 PM IST 
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
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.iata.org/IATA/EDIST}FlightMetadata"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "flightMetadata"
})
@XmlRootElement(name = "FlightMetadatas")
public class FlightMetadatas {

    @XmlElement(name = "FlightMetadata", required = true)
    protected FlightMetadata flightMetadata;

    /**
     * Gets the value of the flightMetadata property.
     * 
     * @return
     *     possible object is
     *     {@link FlightMetadata }
     *     
     */
    public FlightMetadata getFlightMetadata() {
        return flightMetadata;
    }

    /**
     * Sets the value of the flightMetadata property.
     * 
     * @param value
     *     allowed object is
     *     {@link FlightMetadata }
     *     
     */
    public void setFlightMetadata(FlightMetadata value) {
        this.flightMetadata = value;
    }

}
