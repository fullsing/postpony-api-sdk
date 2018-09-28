package com.postpony.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;

@XmlAccessorType(XmlAccessType.FIELD)
public class AddressInfo {

    /// <summary>
    /// 个人名称 
    /// </summary>
    @XmlElement(name = "PersonName", required = true)
     String personName;

    /// <summary>
    /// 公司名称
    /// </summary>
    @XmlElement(name = "CompanyName", required = true)
     String companyName;


    /// <summary>
    ///电话号码
    /// </summary>
    @XmlElement(name = "PhoneNumber", required = true)
     String phoneNumber;


    /// <summary>
    /// 街道地址
    /// </summary>
    @XmlElementWrapper(name = "StreetLines")
    @XmlElement(name = "string")
     String[] streetLines;


    /// <summary>
    /// 城市
    /// </summary>
    @XmlElement(name = "City", required = true)
     String city;

    /// <summary>
    /// 州编码，如果不存在州的国家，传省份名称即可
    /// </summary>
    @XmlElement(name = "StateOrProvinceCode", required = true)
     String stateOrProvinceCode;

    /// <summary>
    /// 邮编
    /// </summary>

    @XmlElement(name = "PostalCode", required = true)
     String postalCode;


    /// <summary>
    /// zip4
    /// </summary>
    @XmlElement(name = "Zip4", required = true)
     String zip4;

    /// <summary>
    /// 国家二字码
    /// </summary>

    @XmlElement(name = "CountryCode", required = true)
     String countryCode;

    /// <summary>
    /// 是否是家庭住址
    /// </summary>
    @XmlElement(name = "IsResidentialAddress")
     boolean isResidentialAddress;

    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String[] getStreetLines() {
        return streetLines;
    }

    public void setStreetLines(String[] streetLines) {
        this.streetLines = streetLines;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStateOrProvinceCode() {
        return stateOrProvinceCode;
    }

    public void setStateOrProvinceCode(String stateOrProvinceCode) {
        this.stateOrProvinceCode = stateOrProvinceCode;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getZip4() {
        return zip4;
    }

    public void setZip4(String zip4) {
        this.zip4 = zip4;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public boolean isResidentialAddress() {
        return isResidentialAddress;
    }

    public void setResidentialAddress(boolean residentialAddress) {
        isResidentialAddress = residentialAddress;
    }

}
