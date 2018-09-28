package com.postpony.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
public class RateResult extends ResponseBase {

    public List<RateResultDetail> getData() {
        return data;
    }

    public void setData(List<RateResultDetail> data) {
        this.data = data;
    }

    /// <summary>
    /// 包裹信息
    /// </summary>
    @XmlElementWrapper(name = "Data")
    @XmlElement(name = "RateResultDetail")
    private List<RateResultDetail> data;
}
