package com.postpony.model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="ShippingDetailResponseV2")
public class ShippingDetailResponse extends ResponseBase{

    public LabelInfoDetail getDetail() {
        return detail;
    }

    public void setDetail(LabelInfoDetail detail) {
        this.detail = detail;
    }

    @XmlElement(name = "Detail")
    LabelInfoDetail detail;
}
