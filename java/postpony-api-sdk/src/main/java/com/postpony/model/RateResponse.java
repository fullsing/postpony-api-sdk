package com.postpony.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="RateResponse")
@XmlAccessorType(XmlAccessType.FIELD)
public class RateResponse  extends ResponseBase{

    @XmlElement(name="Fedex")
    private RateResult fedex;

    @XmlElement(name="Usps")
    private RateResult usps;

    @XmlElement(name="Ups")
    private RateResult ups;

    @XmlElement(name="Dhl")
    private RateResult dhl;

    public RateResult getFedex() {
        return fedex;
    }

    public void setFedex(RateResult fedex) {
        this.fedex = fedex;
    }

    public RateResult getUsps() {
        return usps;
    }

    public void setUsps(RateResult usps) {
        this.usps = usps;
    }

    public RateResult getUps() {
        return ups;
    }

    public void setUps(RateResult ups) {
        this.ups = ups;
    }

    public RateResult getDhl() {
        return dhl;
    }

    public void setDhl(RateResult dhl) {
        this.dhl = dhl;
    }


}
