package com.postpony.model;

import javax.xml.bind.annotation.*;
import java.util.List;
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "ShippingRatesRequest")
public class RateRequest extends ClientRequestCom{
    public List<PackageItemInfo> getPackageInfos() {
        return packageInfos;
    }

    public void setPackageInfos(List<PackageItemInfo> packageInfos) {
        this.packageInfos = packageInfos;
    }

    public AddressInfo getOriginalAddress() {
        return originalAddress;
    }

    public void setOriginalAddress(AddressInfo originalAddress) {
        this.originalAddress = originalAddress;
    }

    public AddressInfo getDestinationAddress() {
        return destinationAddress;
    }

    public void setDestinationAddress(AddressInfo destinationAddress) {
        this.destinationAddress = destinationAddress;
    }

    public boolean isCanGetBaseRate() {
        return canGetBaseRate;
    }

    public void setCanGetBaseRate(boolean canGetBaseRate) {
        this.canGetBaseRate = canGetBaseRate;
    }

    public boolean isUpsRate() {
        return upsRate;
    }

    public void setUpsRate(boolean upsRate) {
        this.upsRate = upsRate;
    }

    /// <summary>
    /// 包裹信息
    /// </summary>
    @XmlElementWrapper(name = "PackageInfos")
    @XmlElement(name = "PackageItemInfo")
     List<PackageItemInfo> packageInfos;

    /// <summary>
    /// 包裹发送起始地址
    /// </summary>
    @XmlElement(name = "OriginalAddress")
     AddressInfo originalAddress;

    /// <summary>
    /// 包裹发送目的地地址
    /// </summary>
    @XmlElement(name = "DestinationAddress")
     AddressInfo destinationAddress;

    /// <summary>
    /// 是否获取Ups原价信息
    /// </summary>
    @XmlElement(name = "CanGetBaseRate")
     boolean canGetBaseRate;

    /// <summary>
    /// 是否获取ups渠道的报价信息
    /// </summary>
    @XmlElement(name = "UpsRate")
     boolean upsRate;
}
