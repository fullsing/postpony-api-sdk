package com.postpony.model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@XmlRootElement(name="TrackingResponse")
public class TrackingResponse extends ResponseBase{


    public List<TrackingDetail> getTrackingData() {
        return TrackingData;
    }

    public void setTrackingData(List<TrackingDetail> trackingData) {
        TrackingData = trackingData;
    }

    @XmlElementWrapper(name="TrackingData")
    @XmlElement(name = "TrackingDetail")
    List<TrackingDetail> TrackingData;
}
