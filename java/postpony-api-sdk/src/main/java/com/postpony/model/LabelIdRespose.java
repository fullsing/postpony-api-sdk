package com.postpony.model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import java.math.BigDecimal;
import java.util.List;

@XmlRootElement(name="LabelIdRespose")
public class LabelIdRespose extends ResponseBase{

    @XmlElement(name = "LabelId")
    int labelId;

    @XmlElementWrapper(name = "TrackNos")
    @XmlElement(name = "string")
    List<String> trackNos;

    @XmlElement(name = "Weight")
    BigDecimal weight;

    @XmlElement(name = "TotalFreight")
    BigDecimal totalFreight;


    @XmlElement(name = "LabelUrl")
    String labelUrl;

    public int getLabelId() {
        return labelId;
    }

    public void setLabelId(int labelId) {
        this.labelId = labelId;
    }

    public List<String> getTrackNos() {
        return trackNos;
    }

    public void setTrackNos(List<String> trackNos) {
        this.trackNos = trackNos;
    }

    public BigDecimal getWeight() {
        return weight;
    }

    public void setWeight(BigDecimal weight) {
        this.weight = weight;
    }

    public BigDecimal getTotalFreight() {
        return totalFreight;
    }

    public void setTotalFreight(BigDecimal totalFreight) {
        this.totalFreight = totalFreight;
    }

    public String getLabelUrl() {
        return labelUrl;
    }

    public void setLabelUrl(String labelUrl) {
        this.labelUrl = labelUrl;
    }

}
