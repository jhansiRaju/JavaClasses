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
 *       &lt;all&gt;
 *         &lt;element ref="{}pinmailer" minOccurs="0"/&gt;
 *         &lt;element ref="{}actmailer" minOccurs="0"/&gt;
 *         &lt;element ref="{}packaging" minOccurs="0"/&gt;
 *         &lt;element ref="{}shipping" minOccurs="0"/&gt;
 *         &lt;element ref="{}returns" minOccurs="0"/&gt;
 *         &lt;element ref="{}register" minOccurs="0"/&gt;
 *         &lt;element ref="{}otherinfo" minOccurs="0"/&gt;
 *         &lt;element ref="{}bominfo" minOccurs="0"/&gt;
 *       &lt;/all&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {

})
@XmlRootElement(name = "supplementals")
public class Supplementals {

    protected Pinmailer pinmailer;
    protected Actmailer actmailer;
    protected Packaging packaging;
    protected Shipping shipping;
    protected Returns returns;
    protected Register register;
    protected Otherinfo otherinfo;
    protected Bominfo bominfo;

    /**
     * Gets the value of the pinmailer property.
     * 
     * @return
     *     possible object is
     *     {@link Pinmailer }
     *     
     */
    public Pinmailer getPinmailer() {
        return pinmailer;
    }

    /**
     * Sets the value of the pinmailer property.
     * 
     * @param value
     *     allowed object is
     *     {@link Pinmailer }
     *     
     */
    public void setPinmailer(Pinmailer value) {
        this.pinmailer = value;
    }

    /**
     * Gets the value of the actmailer property.
     * 
     * @return
     *     possible object is
     *     {@link Actmailer }
     *     
     */
    public Actmailer getActmailer() {
        return actmailer;
    }

    /**
     * Sets the value of the actmailer property.
     * 
     * @param value
     *     allowed object is
     *     {@link Actmailer }
     *     
     */
    public void setActmailer(Actmailer value) {
        this.actmailer = value;
    }

    /**
     * Gets the value of the packaging property.
     * 
     * @return
     *     possible object is
     *     {@link Packaging }
     *     
     */
    public Packaging getPackaging() {
        return packaging;
    }

    /**
     * Sets the value of the packaging property.
     * 
     * @param value
     *     allowed object is
     *     {@link Packaging }
     *     
     */
    public void setPackaging(Packaging value) {
        this.packaging = value;
    }

    /**
     * Gets the value of the shipping property.
     * 
     * @return
     *     possible object is
     *     {@link Shipping }
     *     
     */
    public Shipping getShipping() {
        return shipping;
    }

    /**
     * Sets the value of the shipping property.
     * 
     * @param value
     *     allowed object is
     *     {@link Shipping }
     *     
     */
    public void setShipping(Shipping value) {
        this.shipping = value;
    }

    /**
     * Gets the value of the returns property.
     * 
     * @return
     *     possible object is
     *     {@link Returns }
     *     
     */
    public Returns getReturns() {
        return returns;
    }

    /**
     * Sets the value of the returns property.
     * 
     * @param value
     *     allowed object is
     *     {@link Returns }
     *     
     */
    public void setReturns(Returns value) {
        this.returns = value;
    }

    /**
     * Gets the value of the register property.
     * 
     * @return
     *     possible object is
     *     {@link Register }
     *     
     */
    public Register getRegister() {
        return register;
    }

    /**
     * Sets the value of the register property.
     * 
     * @param value
     *     allowed object is
     *     {@link Register }
     *     
     */
    public void setRegister(Register value) {
        this.register = value;
    }

    /**
     * Gets the value of the otherinfo property.
     * 
     * @return
     *     possible object is
     *     {@link Otherinfo }
     *     
     */
    public Otherinfo getOtherinfo() {
        return otherinfo;
    }

    /**
     * Sets the value of the otherinfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Otherinfo }
     *     
     */
    public void setOtherinfo(Otherinfo value) {
        this.otherinfo = value;
    }

    /**
     * Gets the value of the bominfo property.
     * 
     * @return
     *     possible object is
     *     {@link Bominfo }
     *     
     */
    public Bominfo getBominfo() {
        return bominfo;
    }

    /**
     * Sets the value of the bominfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Bominfo }
     *     
     */
    public void setBominfo(Bominfo value) {
        this.bominfo = value;
    }

}
