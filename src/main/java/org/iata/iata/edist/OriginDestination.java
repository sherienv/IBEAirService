//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.06.16 at 03:34:45 PM IST 
//


package org.iata.iata.edist;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


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
 *         &lt;element ref="{http://www.iata.org/IATA/EDIST}Departure"/>
 *         &lt;element ref="{http://www.iata.org/IATA/EDIST}Arrival"/>
 *       &lt;/sequence>
 *       &lt;attribute name="OriginDestinationKey" use="required" type="{http://www.w3.org/2001/XMLSchema}NCName" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "departure",
    "arrival"
})
@XmlRootElement(name = "OriginDestination")
public class OriginDestination {

    @XmlElement(name = "Departure", required = true)
    protected Departure departure;
    @XmlElement(name = "Arrival", required = true)
    protected AirportCode arrival;
    @XmlAttribute(name = "OriginDestinationKey", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String originDestinationKey;

    /**
     * Gets the value of the departure property.
     * 
     * @return
     *     possible object is
     *     {@link Departure }
     *     
     */
    public Departure getDeparture() {
        return departure;
    }

    /**
     * Sets the value of the departure property.
     * 
     * @param value
     *     allowed object is
     *     {@link Departure }
     *     
     */
    public void setDeparture(Departure value) {
        this.departure = value;
    }

    /**
     * Gets the value of the arrival property.
     * 
     * @return
     *     possible object is
     *     {@link AirportCode }
     *     
     */
    public AirportCode getArrival() {
        return arrival;
    }

    /**
     * Sets the value of the arrival property.
     * 
     * @param value
     *     allowed object is
     *     {@link AirportCode }
     *     
     */
    public void setArrival(AirportCode value) {
        this.arrival = value;
    }

    /**
     * Gets the value of the originDestinationKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOriginDestinationKey() {
        return originDestinationKey;
    }

    /**
     * Sets the value of the originDestinationKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOriginDestinationKey(String value) {
        this.originDestinationKey = value;
    }

}