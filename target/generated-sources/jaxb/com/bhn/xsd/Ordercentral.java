//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.08.30 at 09:58:33 PM IST 
//


package com.bhn.xsd;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 *         &lt;element ref="{}fulfillmentreq" minOccurs="0"/&gt;
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
    "fulfillmentreq"
})
@XmlRootElement(name = "ordercentral")
public class Ordercentral {

    protected Fulfillmentreq fulfillmentreq;

    /**
     * Gets the value of the fulfillmentreq property.
     * 
     * @return
     *     possible object is
     *     {@link Fulfillmentreq }
     *     
     */
    public Fulfillmentreq getFulfillmentreq() {
        return fulfillmentreq;
    }

    /**
     * Sets the value of the fulfillmentreq property.
     * 
     * @param value
     *     allowed object is
     *     {@link Fulfillmentreq }
     *     
     */
    public void setFulfillmentreq(Fulfillmentreq value) {
        this.fulfillmentreq = value;
    }

}