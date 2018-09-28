package com.postpony.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
public class ShipRequestDetail {

    /// <summary>
    /// 发件人信息
    /// </summary>
    @XmlElement(name = "Shipper")
    AddressInfo shipper;

    public AddressInfo getShipper() {
        return shipper;
    }

    public void setShipper(AddressInfo shipper) {
        this.shipper = shipper;
    }

    public AddressInfo getRecipient() {
        return recipient;
    }

    public void setRecipient(AddressInfo recipient) {
        this.recipient = recipient;
    }

    public WaybillInformation getPackageInfo() {
        return packageInfo;
    }

    public void setPackageInfo(WaybillInformation packageInfo) {
        this.packageInfo = packageInfo;
    }

    public List<PackageItemInfo> getPackageItems() {
        return packageItems;
    }

    public void setPackageItems(List<PackageItemInfo> packageItems) {
        this.packageItems = packageItems;
    }

    public List<CustomsItem> getCustomsList() {
        return customsList;
    }

    public void setCustomsList(List<CustomsItem> customsList) {
        this.customsList = customsList;
    }

    public String getLbSize() {
        return lbSize;
    }

    public void setLbSize(String lbSize) {
        this.lbSize = lbSize;
    }

    public String getSignature() {
        return signature;
    }

    public void setSignature(String signature) {
        this.signature = signature;
    }

    /// <summary>
    /// 收件人信息
    /// </summary>
    @XmlElement(name = "Recipient")
    AddressInfo recipient;

    /// <summary>
    /// 运单其他信息
    /// </summary>
    @XmlElement(name = "Package")
    WaybillInformation packageInfo;


    /// <summary>
    /// 包裹列表
    /// </summary>
    @XmlElementWrapper(name = "PackageItems")
    @XmlElement(name = "PackageItemInfo")
    List<PackageItemInfo> packageItems;

    /// <summary>
    /// 申报价值列表
    /// </summary>
    @XmlElement(name = "CustomsList")
    List<CustomsItem> customsList;

    /// <summary>
    /// 面单尺寸规格
    /// </summary>
    @XmlElement(name = "LbSize")
    String lbSize;


    /// <summary>
    /// 签名类型
    /// </summary>
    @XmlElement(name = "Signature")
    String signature;
}
