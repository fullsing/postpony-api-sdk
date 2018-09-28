package com.postpony.model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "TrackingRequest")
public class TrackingRequest extends  ClientRequestCom {


    public String getLogisticsCode() {
        return logisticsCode;
    }

    public void setLogisticsCode(String logisticsCode) {
        this.logisticsCode = logisticsCode;
    }



    public String getTrackNo() {
        return trackNo;
    }

    public void setTrackNo(String trackNo) {
        this.trackNo = trackNo;
    }

    @XmlElement(name = "TrackNo")
    private String trackNo;

    @XmlElement(name = "LogisticsCode")
    private String logisticsCode;
}
