package com.bhn.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import org.springframework.data.mongodb.core.mapping.Document;

import com.bhn.xsd.Header;
import com.bhn.xsd.Orders;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "header",
    "orders"
})
@XmlRootElement(name = "fulfillmentreq")
@Getter
@Setter
@ToString
@Document(collection = "fragment")
@Data
public class FullfillmentreqModel {

    @XmlElement(required = true)
    protected Header header;
    @XmlElement(required = true)
    protected Orders orders;

    /**
     * Gets the value of the header property.
     * 
     * @return
     *     possible object is
     *     {@link Header }
     *     
     */
    public Header getHeader() {
        return header;
    }

    /**
     * Sets the value of the header property.
     * 
     * @param value
     *     allowed object is
     *     {@link Header }
     *     
     */
    public void setHeader(Header value) {
        this.header = value;
    }

    /**
     * Gets the value of the orders property.
     * 
     * @return
     *     possible object is
     *     {@link Orders }
     *     
     */
    public Orders getOrders() {
        return orders;
    }

    /**
     * Sets the value of the orders property.
     * 
     * @param value
     *     allowed object is
     *     {@link Orders }
     *     
     */
    public void setOrders(Orders value) {
        this.orders = value;
    }

}