package com.postpony.model;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.math.BigDecimal;

@XmlType(name = "PackageItemInfo")
@XmlAccessorType(XmlAccessType.FIELD)
 public class PackageItemInfo {

    /// <summary>
    /// 注意单位是英寸
    /// </summary>
    @XmlElement(name = "Length")
     BigDecimal length;

    /// <summary>
    /// 注意单位是英寸
    /// </summary>
    @XmlElement(name = "Width")
     BigDecimal width;

    /// <summary>
    /// 注意单位是英寸
    /// </summary>
    @XmlElement(name = "Height")
     BigDecimal height;


    /// <summary>
    /// 重量 注意单位是磅
    /// </summary>
    @XmlElement(name = "Weight")
     BigDecimal weight;

    /// <summary>
    /// 重量 注意单位是磅
    /// </summary>
    @XmlElement(name = "WeightOz")
     BigDecimal weightOz;

    /// <summary>
    /// 保险费
    /// </summary>
    @XmlElement(name = "Insurance")
     BigDecimal insurance;

    /// <summary>
    /// 包裹跟踪号
    /// </summary>
    @XmlElement(name = "TrackNo")
     String trackNo;


    public BigDecimal getLength() {
        return length;
    }

    public void setLength(BigDecimal length) {
        this.length = length;
    }

    public BigDecimal getWidth() {
        return width;
    }

    public void setWidth(BigDecimal width) {
        this.width = width;
    }

    public BigDecimal getHeight() {
        return height;
    }

    public void setHeight(BigDecimal height) {
        this.height = height;
    }

    public BigDecimal getWeight() {
        return weight;
    }

    public void setWeight(BigDecimal weight) {
        this.weight = weight;
    }

    public BigDecimal getWeightOz() {
        return weightOz;
    }

    public void setWeightOz(BigDecimal weightOz) {
        this.weightOz = weightOz;
    }

    public BigDecimal getInsurance() {
        return insurance;
    }

    public void setInsurance(BigDecimal insurance) {
        this.insurance = insurance;
    }

    public String getTrackNo() {
        return trackNo;
    }

    public void setTrackNo(String trackNo) {
        this.trackNo = trackNo;
    }

    public String getUspsMailpiece() {
        return uspsMailpiece;
    }

    public void setUspsMailpiece(String uspsMailpiece) {
        this.uspsMailpiece = uspsMailpiece;
    }

    public boolean isOurInsurance() {
        return isOurInsurance;
    }

    public void setOurInsurance(boolean ourInsurance) {
        isOurInsurance = ourInsurance;
    }

    /// <summary>
    /// usps指定规格盒子
    /// </summary>
    @XmlElement(name = "UspsMailpiece")
     String uspsMailpiece;


    /// <summary>
    /// 是否购买postpony保险
    /// </summary>
    @XmlElement(name = "IsOurInsurance")
     boolean isOurInsurance;
}
