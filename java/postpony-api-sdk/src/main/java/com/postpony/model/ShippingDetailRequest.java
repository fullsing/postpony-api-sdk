package com.postpony.model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="ShippingDetailRequest")
public class ShippingDetailRequest extends ClientRequestCom{


    public int getLabelId() {
        return labelId;
    }

    public void setLabelId(int labelId) {
        this.labelId = labelId;
    }

    @XmlElement(name = "LabelId")
    private int labelId;
}
