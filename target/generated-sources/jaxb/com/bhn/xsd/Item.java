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
 *         &lt;element ref="{}id"/&gt;
 *         &lt;element ref="{}lineitemid"/&gt;
 *         &lt;element name="packagingsequencenumber" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="bundleid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element ref="{}partnersku" minOccurs="0"/&gt;
 *         &lt;element name="product" type="{}product" minOccurs="0"/&gt;
 *         &lt;element ref="{}supplementals" minOccurs="0"/&gt;
 *         &lt;element ref="{}cardimageurlfront" minOccurs="0"/&gt;
 *         &lt;element ref="{}cards" minOccurs="0"/&gt;
 *         &lt;element name="fulfillmentinstructions" type="{}fulfillmentinstructions" minOccurs="0"/&gt;
 *         &lt;element name="clientprogramid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element ref="{}imageurls" minOccurs="0"/&gt;
 *         &lt;element ref="{}additionalinfos" minOccurs="0"/&gt;
 *         &lt;element ref="{}expeditefulfillment" minOccurs="0"/&gt;
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
@XmlRootElement(name = "item")
public class Item {

    @XmlElement(required = true)
    protected String id;
    @XmlElement(required = true)
    protected String lineitemid;
    protected Integer packagingsequencenumber;
    protected String bundleid;
    protected String partnersku;
    protected Product product;
    protected Supplementals supplementals;
    protected String cardimageurlfront;
    protected Cards cards;
    protected String fulfillmentinstructions;
    protected String clientprogramid;
    protected Imageurls imageurls;
    protected Additionalinfos additionalinfos;
    protected Boolean expeditefulfillment;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the lineitemid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLineitemid() {
        return lineitemid;
    }

    /**
     * Sets the value of the lineitemid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLineitemid(String value) {
        this.lineitemid = value;
    }

    /**
     * Gets the value of the packagingsequencenumber property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPackagingsequencenumber() {
        return packagingsequencenumber;
    }

    /**
     * Sets the value of the packagingsequencenumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPackagingsequencenumber(Integer value) {
        this.packagingsequencenumber = value;
    }

    /**
     * Gets the value of the bundleid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBundleid() {
        return bundleid;
    }

    /**
     * Sets the value of the bundleid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBundleid(String value) {
        this.bundleid = value;
    }

    /**
     * Gets the value of the partnersku property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartnersku() {
        return partnersku;
    }

    /**
     * Sets the value of the partnersku property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartnersku(String value) {
        this.partnersku = value;
    }

    /**
     * Gets the value of the product property.
     * 
     * @return
     *     possible object is
     *     {@link Product }
     *     
     */
    public Product getProduct() {
        return product;
    }

    /**
     * Sets the value of the product property.
     * 
     * @param value
     *     allowed object is
     *     {@link Product }
     *     
     */
    public void setProduct(Product value) {
        this.product = value;
    }

    /**
     * Gets the value of the supplementals property.
     * 
     * @return
     *     possible object is
     *     {@link Supplementals }
     *     
     */
    public Supplementals getSupplementals() {
        return supplementals;
    }

    /**
     * Sets the value of the supplementals property.
     * 
     * @param value
     *     allowed object is
     *     {@link Supplementals }
     *     
     */
    public void setSupplementals(Supplementals value) {
        this.supplementals = value;
    }

    /**
     * Gets the value of the cardimageurlfront property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardimageurlfront() {
        return cardimageurlfront;
    }

    /**
     * Sets the value of the cardimageurlfront property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardimageurlfront(String value) {
        this.cardimageurlfront = value;
    }

    /**
     * Gets the value of the cards property.
     * 
     * @return
     *     possible object is
     *     {@link Cards }
     *     
     */
    public Cards getCards() {
        return cards;
    }

    /**
     * Sets the value of the cards property.
     * 
     * @param value
     *     allowed object is
     *     {@link Cards }
     *     
     */
    public void setCards(Cards value) {
        this.cards = value;
    }

    /**
     * Gets the value of the fulfillmentinstructions property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFulfillmentinstructions() {
        return fulfillmentinstructions;
    }

    /**
     * Sets the value of the fulfillmentinstructions property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFulfillmentinstructions(String value) {
        this.fulfillmentinstructions = value;
    }

    /**
     * Gets the value of the clientprogramid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClientprogramid() {
        return clientprogramid;
    }

    /**
     * Sets the value of the clientprogramid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClientprogramid(String value) {
        this.clientprogramid = value;
    }

    /**
     * Gets the value of the imageurls property.
     * 
     * @return
     *     possible object is
     *     {@link Imageurls }
     *     
     */
    public Imageurls getImageurls() {
        return imageurls;
    }

    /**
     * Sets the value of the imageurls property.
     * 
     * @param value
     *     allowed object is
     *     {@link Imageurls }
     *     
     */
    public void setImageurls(Imageurls value) {
        this.imageurls = value;
    }

    /**
     * Gets the value of the additionalinfos property.
     * 
     * @return
     *     possible object is
     *     {@link Additionalinfos }
     *     
     */
    public Additionalinfos getAdditionalinfos() {
        return additionalinfos;
    }

    /**
     * Sets the value of the additionalinfos property.
     * 
     * @param value
     *     allowed object is
     *     {@link Additionalinfos }
     *     
     */
    public void setAdditionalinfos(Additionalinfos value) {
        this.additionalinfos = value;
    }

    /**
     * Gets the value of the expeditefulfillment property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isExpeditefulfillment() {
        return expeditefulfillment;
    }

    /**
     * Sets the value of the expeditefulfillment property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setExpeditefulfillment(Boolean value) {
        this.expeditefulfillment = value;
    }

}
