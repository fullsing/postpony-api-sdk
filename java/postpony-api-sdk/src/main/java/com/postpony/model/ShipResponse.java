package com.postpony.model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import java.math.BigDecimal;
import java.util.List;

@XmlRootElement(name="ShipResponse")
public class ShipResponse extends ResponseBase {


    public String getMainTrackingNum() {
        return mainTrackingNum;
    }

    public void setMainTrackingNum(String mainTrackingNum) {
        this.mainTrackingNum = mainTrackingNum;
    }

    public List<byte[]> getLableDataList() {
        return lableDataList;
    }

    public void setLableDataList(List<byte[]> lableDataList) {
        this.lableDataList = lableDataList;
    }

    public List<PackageItemInfo> getTrackNoList() {
        return trackNoList;
    }

    public void setTrackNoList(List<PackageItemInfo> trackNoList) {
        this.trackNoList = trackNoList;
    }

    public int getLabelId() {
        return labelId;
    }

    public void setLabelId(int labelId) {
        this.labelId = labelId;
    }

    public BigDecimal getTotalFreight() {
        return totalFreight;
    }

    public void setTotalFreight(BigDecimal totalFreight) {
        this.totalFreight = totalFreight;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    /// <summary>
    /// 主单号（相对于多包裹的情况 ）
    /// </summary>
    @XmlElement(name = "MainTrackingNum")
    String mainTrackingNum;

    @XmlElementWrapper(name="LableData")
    @XmlElement(name = "base64Binary")
    List<byte[]> lableDataList;


    @XmlElementWrapper(name="TrackNoList")
    @XmlElement(name = "PackageItemInfo")
    List<PackageItemInfo> trackNoList;

    @XmlElement(name = "LabelId")
    int labelId;

    @XmlElement(name = "TotalFreight")
    BigDecimal totalFreight;

    @XmlElement(name = "Code")
    String code;
}
