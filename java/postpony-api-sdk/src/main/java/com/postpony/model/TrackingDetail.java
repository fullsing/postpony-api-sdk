package com.postpony.model;

import javax.xml.bind.annotation.XmlElement;

public class TrackingDetail {


    @XmlElement(name = "TimeStamp")
    String timeStamp;

    @XmlElement(name = "LocationDescription")
    String locationDescription;
}
