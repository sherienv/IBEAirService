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
 *       &lt;sequence>
 *         &lt;element ref="{http://www.iata.org/IATA/EDIST}OriginDestinations"/>
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
    "originDestinations"
})
@XmlRootElement(name = "CoreQuery")
public class CoreQuery {

    @XmlElement(name = "OriginDestinations", required = true)
    protected OriginDestinations originDestinations;

    /**
     * Gets the value of the originDestinations property.
     * 
     * @return
     *     possible object is
     *     {@link OriginDestinations }
     *     
     */
    public OriginDestinations getOriginDestinations() {
        return originDestinations;
    }

    /**
     * Sets the value of the originDestinations property.
     * 
     * @param value
     *     allowed object is
     *     {@link OriginDestinations }
     *     
     */
    public void setOriginDestinations(OriginDestinations value) {
        this.originDestinations = value;
    }

}
