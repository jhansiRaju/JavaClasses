package com.bhn.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "address", propOrder = {
    "attnto",
    "firstName",
    "lastname",
    "careof",
    "companyname",
    "addressline1",
    "addressline2",
    "addressline3",
    "city",
    "districtorcounty",
    "state",
    "postalcode",
    "country",
    "phone",
    "contactemail"
})
@Getter
@Setter
@ToString
@Document(collection = "fragment")
@Data
public class AddressModel {

    protected String attnto;
    protected String firstName;
    protected String lastname;
    protected String careof;
    protected String companyname;
    protected String addressline1;
    protected String addressline2;
    protected String addressline3;
    protected String city;
    protected String districtorcounty;
    protected String state;
    protected String postalcode;
    protected String country;
    protected String phone;
    protected String contactemail;

    /**
     * Gets the value of the attnto property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAttnto() {
        return attnto;
    }

    /**
     * Sets the value of the attnto property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAttnto(String value) {
        this.attnto = value;
    }

    /**
     * Gets the value of the firstname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirstname() {
        return firstName;
    }

    /**
     * Sets the value of the firstname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirstname(String value) {
        this.firstName = value;
    }

    /**
     * Gets the value of the lastname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastname() {
        return lastname;
    }

    /**
     * Sets the value of the lastname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastname(String value) {
        this.lastname = value;
    }

    /**
     * Gets the value of the careof property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCareof() {
        return careof;
    }

    /**
     * Sets the value of the careof property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCareof(String value) {
        this.careof = value;
    }

    /**
     * Gets the value of the companyname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompanyname() {
        return companyname;
    }

    /**
     * Sets the value of the companyname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompanyname(String value) {
        this.companyname = value;
    }

    /**
     * Gets the value of the addressline1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddressline1() {
        return addressline1;
    }

    /**
     * Sets the value of the addressline1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddressline1(String value) {
        this.addressline1 = value;
    }

    /**
     * Gets the value of the addressline2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddressline2() {
        return addressline2;
    }

    /**
     * Sets the value of the addressline2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddressline2(String value) {
        this.addressline2 = value;
    }

    /**
     * Gets the value of the addressline3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddressline3() {
        return addressline3;
    }

    /**
     * Sets the value of the addressline3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddressline3(String value) {
        this.addressline3 = value;
    }

    /**
     * Gets the value of the city property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCity() {
        return city;
    }

    /**
     * Sets the value of the city property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCity(String value) {
        this.city = value;
    }

    /**
     * Gets the value of the districtorcounty property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDistrictorcounty() {
        return districtorcounty;
    }

    /**
     * Sets the value of the districtorcounty property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDistrictorcounty(String value) {
        this.districtorcounty = value;
    }

    /**
     * Gets the value of the state property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getState() {
        return state;
    }

    /**
     * Sets the value of the state property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setState(String value) {
        this.state = value;
    }

    /**
     * Gets the value of the postalcode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostalcode() {
        return postalcode;
    }

    /**
     * Sets the value of the postalcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostalcode(String value) {
        this.postalcode = value;
    }

    /**
     * Gets the value of the country property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountry() {
        return country;
    }

    /**
     * Sets the value of the country property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountry(String value) {
        this.country = value;
    }

    /**
     * Gets the value of the phone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhone() {
        return phone;
    }

    /**
     * Sets the value of the phone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhone(String value) {
        this.phone = value;
    }

    /**
     * Gets the value of the contactemail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactemail() {
        return contactemail;
    }

    /**
     * Sets the value of the contactemail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactemail(String value) {
        this.contactemail = value;
    }

}
