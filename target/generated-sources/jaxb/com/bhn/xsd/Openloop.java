//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.08.30 at 09:58:33 PM IST 
//


package com.bhn.xsd;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
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
 *         &lt;element ref="{}pan"/&gt;
 *         &lt;element ref="{}proxy" minOccurs="0"/&gt;
 *         &lt;element ref="{}paymentnetwork" minOccurs="0"/&gt;
 *         &lt;element ref="{}maskcardnumber" minOccurs="0"/&gt;
 *         &lt;element ref="{}reloaditchitnumber" minOccurs="0"/&gt;
 *         &lt;element name="embossline1" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{}embosscardline"&gt;
 *               &lt;minLength value="0"/&gt;
 *               &lt;maxLength value="26"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="embossline2" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{}embosscardline"&gt;
 *               &lt;minLength value="0"/&gt;
 *               &lt;maxLength value="26"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="embossline3" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{}embosscardline"&gt;
 *               &lt;minLength value="0"/&gt;
 *               &lt;maxLength value="26"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="embossline4" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{}embosscardline"&gt;
 *               &lt;minLength value="0"/&gt;
 *               &lt;maxLength value="26"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="embossline5" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{}embosscardline"&gt;
 *               &lt;minLength value="0"/&gt;
 *               &lt;maxLength value="26"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="embossline6" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{}embosscardline"&gt;
 *               &lt;minLength value="0"/&gt;
 *               &lt;maxLength value="26"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="indentdata" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{}indentdata"&gt;
 *               &lt;minLength value="0"/&gt;
 *               &lt;maxLength value="26"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element ref="{}barcode" minOccurs="0"/&gt;
 *         &lt;element ref="{}track1" minOccurs="0"/&gt;
 *         &lt;element ref="{}track2" minOccurs="0"/&gt;
 *         &lt;element ref="{}track3" minOccurs="0"/&gt;
 *         &lt;element ref="{}carriertrack1" minOccurs="0"/&gt;
 *         &lt;element ref="{}carriertrack2" minOccurs="0"/&gt;
 *         &lt;element ref="{}cardholdername" minOccurs="0"/&gt;
 *         &lt;element ref="{}issuedate" minOccurs="0"/&gt;
 *         &lt;element ref="{}expirydate" minOccurs="0"/&gt;
 *         &lt;element ref="{}servicecode" minOccurs="0"/&gt;
 *         &lt;element ref="{}pvvoffset" minOccurs="0"/&gt;
 *         &lt;element ref="{}pinoffset" minOccurs="0"/&gt;
 *         &lt;element name="ddtrack1" type="{}dd" minOccurs="0"/&gt;
 *         &lt;element name="ddtrack2" type="{}dd" minOccurs="0"/&gt;
 *         &lt;element name="isgeneratecvv1" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="cvv1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="isgeneratecvv2" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="cvv2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
@XmlRootElement(name = "openloop")
public class Openloop {

    @XmlElement(required = true)
    protected String pan;
    protected String proxy;
    @XmlSchemaType(name = "string")
    protected Paymentnetworktype paymentnetwork;
    protected String maskcardnumber;
    protected String reloaditchitnumber;
    protected String embossline1;
    protected String embossline2;
    protected String embossline3;
    protected String embossline4;
    protected String embossline5;
    protected String embossline6;
    protected String indentdata;
    protected String barcode;
    protected String track1;
    protected String track2;
    protected String track3;
    protected String carriertrack1;
    protected String carriertrack2;
    protected String cardholdername;
    protected String issuedate;
    protected String expirydate;
    protected String servicecode;
    protected String pvvoffset;
    protected String pinoffset;
    protected String ddtrack1;
    protected String ddtrack2;
    protected Boolean isgeneratecvv1;
    protected String cvv1;
    protected Boolean isgeneratecvv2;
    protected String cvv2;

    /**
     * Gets the value of the pan property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPan() {
        return pan;
    }

    /**
     * Sets the value of the pan property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPan(String value) {
        this.pan = value;
    }

    /**
     * Gets the value of the proxy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProxy() {
        return proxy;
    }

    /**
     * Sets the value of the proxy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProxy(String value) {
        this.proxy = value;
    }

    /**
     * Gets the value of the paymentnetwork property.
     * 
     * @return
     *     possible object is
     *     {@link Paymentnetworktype }
     *     
     */
    public Paymentnetworktype getPaymentnetwork() {
        return paymentnetwork;
    }

    /**
     * Sets the value of the paymentnetwork property.
     * 
     * @param value
     *     allowed object is
     *     {@link Paymentnetworktype }
     *     
     */
    public void setPaymentnetwork(Paymentnetworktype value) {
        this.paymentnetwork = value;
    }

    /**
     * Gets the value of the maskcardnumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaskcardnumber() {
        return maskcardnumber;
    }

    /**
     * Sets the value of the maskcardnumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaskcardnumber(String value) {
        this.maskcardnumber = value;
    }

    /**
     * Gets the value of the reloaditchitnumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReloaditchitnumber() {
        return reloaditchitnumber;
    }

    /**
     * Sets the value of the reloaditchitnumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReloaditchitnumber(String value) {
        this.reloaditchitnumber = value;
    }

    /**
     * Gets the value of the embossline1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmbossline1() {
        return embossline1;
    }

    /**
     * Sets the value of the embossline1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmbossline1(String value) {
        this.embossline1 = value;
    }

    /**
     * Gets the value of the embossline2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmbossline2() {
        return embossline2;
    }

    /**
     * Sets the value of the embossline2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmbossline2(String value) {
        this.embossline2 = value;
    }

    /**
     * Gets the value of the embossline3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmbossline3() {
        return embossline3;
    }

    /**
     * Sets the value of the embossline3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmbossline3(String value) {
        this.embossline3 = value;
    }

    /**
     * Gets the value of the embossline4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmbossline4() {
        return embossline4;
    }

    /**
     * Sets the value of the embossline4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmbossline4(String value) {
        this.embossline4 = value;
    }

    /**
     * Gets the value of the embossline5 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmbossline5() {
        return embossline5;
    }

    /**
     * Sets the value of the embossline5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmbossline5(String value) {
        this.embossline5 = value;
    }

    /**
     * Gets the value of the embossline6 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmbossline6() {
        return embossline6;
    }

    /**
     * Sets the value of the embossline6 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmbossline6(String value) {
        this.embossline6 = value;
    }

    /**
     * Gets the value of the indentdata property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIndentdata() {
        return indentdata;
    }

    /**
     * Sets the value of the indentdata property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIndentdata(String value) {
        this.indentdata = value;
    }

    /**
     * Gets the value of the barcode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBarcode() {
        return barcode;
    }

    /**
     * Sets the value of the barcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBarcode(String value) {
        this.barcode = value;
    }

    /**
     * Gets the value of the track1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrack1() {
        return track1;
    }

    /**
     * Sets the value of the track1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrack1(String value) {
        this.track1 = value;
    }

    /**
     * Gets the value of the track2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrack2() {
        return track2;
    }

    /**
     * Sets the value of the track2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrack2(String value) {
        this.track2 = value;
    }

    /**
     * Gets the value of the track3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrack3() {
        return track3;
    }

    /**
     * Sets the value of the track3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrack3(String value) {
        this.track3 = value;
    }

    /**
     * Gets the value of the carriertrack1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCarriertrack1() {
        return carriertrack1;
    }

    /**
     * Sets the value of the carriertrack1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCarriertrack1(String value) {
        this.carriertrack1 = value;
    }

    /**
     * Gets the value of the carriertrack2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCarriertrack2() {
        return carriertrack2;
    }

    /**
     * Sets the value of the carriertrack2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCarriertrack2(String value) {
        this.carriertrack2 = value;
    }

    /**
     *  2-26 characters: All Upper Case
     * 							Surname(s) (separated by space if necessary).
     * 							Surname separator: /
     * 							First name(s) or initial(s) (separated by space if necessary).
     * 							Period (when followed by title).
     * 							Title (when used).
     * 							e.g. SINGH/ATUL.MR
     * 						
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardholdername() {
        return cardholdername;
    }

    /**
     * Sets the value of the cardholdername property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardholdername(String value) {
        this.cardholdername = value;
    }

    /**
     * Format - YYMM
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIssuedate() {
        return issuedate;
    }

    /**
     * Sets the value of the issuedate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIssuedate(String value) {
        this.issuedate = value;
    }

    /**
     * Format - YYMM
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExpirydate() {
        return expirydate;
    }

    /**
     * Sets the value of the expirydate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExpirydate(String value) {
        this.expirydate = value;
    }

    /**
     * Gets the value of the servicecode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServicecode() {
        return servicecode;
    }

    /**
     * Sets the value of the servicecode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServicecode(String value) {
        this.servicecode = value;
    }

    /**
     * e.g. 50, 50.17, 200
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPvvoffset() {
        return pvvoffset;
    }

    /**
     * Sets the value of the pvvoffset property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPvvoffset(String value) {
        this.pvvoffset = value;
    }

    /**
     * e.g. 5000, 5017, 2000
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPinoffset() {
        return pinoffset;
    }

    /**
     * Sets the value of the pinoffset property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPinoffset(String value) {
        this.pinoffset = value;
    }

    /**
     * Gets the value of the ddtrack1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDdtrack1() {
        return ddtrack1;
    }

    /**
     * Sets the value of the ddtrack1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDdtrack1(String value) {
        this.ddtrack1 = value;
    }

    /**
     * Gets the value of the ddtrack2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDdtrack2() {
        return ddtrack2;
    }

    /**
     * Sets the value of the ddtrack2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDdtrack2(String value) {
        this.ddtrack2 = value;
    }

    /**
     * Gets the value of the isgeneratecvv1 property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsgeneratecvv1() {
        return isgeneratecvv1;
    }

    /**
     * Sets the value of the isgeneratecvv1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsgeneratecvv1(Boolean value) {
        this.isgeneratecvv1 = value;
    }

    /**
     * Gets the value of the cvv1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCvv1() {
        return cvv1;
    }

    /**
     * Sets the value of the cvv1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCvv1(String value) {
        this.cvv1 = value;
    }

    /**
     * Gets the value of the isgeneratecvv2 property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsgeneratecvv2() {
        return isgeneratecvv2;
    }

    /**
     * Sets the value of the isgeneratecvv2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsgeneratecvv2(Boolean value) {
        this.isgeneratecvv2 = value;
    }

    /**
     * Gets the value of the cvv2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCvv2() {
        return cvv2;
    }

    /**
     * Sets the value of the cvv2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCvv2(String value) {
        this.cvv2 = value;
    }

}