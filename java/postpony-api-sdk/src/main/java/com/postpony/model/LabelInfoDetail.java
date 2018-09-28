package com.postpony.model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import java.math.BigDecimal;
import java.util.List;

 public class LabelInfoDetail {

    @XmlElement(name = "Shipper")
     AddressInfo shipper;

    @XmlElement(name = "Recipient")
     AddressInfo recipient;



    @XmlElement(name = "LabelSize")
     String labelSize;

    @XmlElement(name = "LabelId")
     int labelId;


    /// <summary>
    /// LabelTotal
    /// </summary>
    @XmlElement(name = "LabelTotal")
     BigDecimal labelTotal;

    @XmlElement(name = "ShipType")
     String shipType;


    /// <summary>
    /// 包裹列表
    /// </summary>
    @XmlElementWrapper(name = "PackageItems")
    @XmlElement(name = "PackageItemInfo")
     List<PackageItemInfo> packageItems;

    @XmlElement(name = "ShipDate")
     String shipDate;

     AddressInfo getShipper() {
        return shipper;
    }

     void setShipper(AddressInfo shipper) {
        this.shipper = shipper;
    }

     AddressInfo getRecipient() {
        return recipient;
    }

     void setRecipient(AddressInfo recipient) {
        this.recipient = recipient;
    }

     String getLabelSize() {
        return labelSize;
    }

     void setLabelSize(String labelSize) {
        this.labelSize = labelSize;
    }

     int getLabelId() {
        return labelId;
    }

     void setLabelId(int labelId) {
        this.labelId = labelId;
    }

     BigDecimal getLabelTotal() {
        return labelTotal;
    }

     void setLabelTotal(BigDecimal labelTotal) {
        this.labelTotal = labelTotal;
    }

     String getShipType() {
        return shipType;
    }

     void setShipType(String shipType) {
        this.shipType = shipType;
    }

     List<PackageItemInfo> getPackageItems() {
        return packageItems;
    }

     void setPackageItems(List<PackageItemInfo> packageItems) {
        this.packageItems = packageItems;
    }

     String getShipDate() {
        return shipDate;
    }

     void setShipDate(String shipDate) {
        this.shipDate = shipDate;
    }


}
