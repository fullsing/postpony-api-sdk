package com.postpony.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import java.math.BigDecimal;

@XmlAccessorType(XmlAccessType.FIELD)
public class RateResultDetail {

    public String getShipType() {
        return shipType;
    }

    public void setShipType(String shipType) {
        this.shipType = shipType;
    }

    public BigDecimal getShippingBaseRate() {
        return shippingBaseRate;
    }

    public void setShippingBaseRate(BigDecimal shippingBaseRate) {
        this.shippingBaseRate = shippingBaseRate;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    @XmlElement(name = "ShipType")
    private String shipType;

    @XmlElement(name = "ShippingBaseRate")
    private BigDecimal shippingBaseRate;

    @XmlElement(name = "Price")
    private BigDecimal price;
}
