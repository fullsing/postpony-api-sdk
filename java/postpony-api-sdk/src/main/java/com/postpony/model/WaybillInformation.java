package com.postpony.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

@XmlAccessorType(XmlAccessType.FIELD)
public class WaybillInformation {


    @XmlElement(name = "ShipDate")
    public String shipDate;

    public String getShipDate() {
        return shipDate;
    }

    public void setShipDate(String shipDate) {
        this.shipDate = shipDate;
    }

    public String getInvoiceNumber() {
        return invoiceNumber;
    }

    public void setInvoiceNumber(String invoiceNumber) {
        this.invoiceNumber = invoiceNumber;
    }

    public String getfTRCode() {
        return fTRCode;
    }

    public void setfTRCode(String fTRCode) {
        this.fTRCode = fTRCode;
    }

    public String getShippingNotes() {
        return shippingNotes;
    }

    public void setShippingNotes(String shippingNotes) {
        this.shippingNotes = shippingNotes;
    }

    public String getCustomerReference() {
        return customerReference;
    }

    public void setCustomerReference(String customerReference) {
        this.customerReference = customerReference;
    }

    public String getContentsType() {
        return contentsType;
    }

    public void setContentsType(String contentsType) {
        this.contentsType = contentsType;
    }

    @XmlElement(name = "InvoiceNumber")
    String invoiceNumber;

    @XmlElement(name = "FTRCode")
    String fTRCode;

    @XmlElement(name = "ShippingNotes")
    String shippingNotes;

    @XmlElement(name = "CustomerReference")
    String customerReference;

    @XmlElement(name = "ContentsType")
    String contentsType;
}
