package com.postpony.model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="LabelIdRequest")
public class LabelIdRequest extends ClientRequestCom {

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    /// <summary>
    /// LabelId
    /// </summary>
    @XmlElement(name = "OrderId")
    private String orderId;
}
