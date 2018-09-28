package com.postpony.model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@XmlRootElement(name="DownLoadRespose")
public class DownLoadRespose extends ResponseBase {

    public List<byte[]> getLableData() {
        return lableData;
    }

    public void setLableData(List<byte[]> lableData) {
        this.lableData = lableData;
    }

    @XmlElementWrapper(name="LableData")
    @XmlElement(name = "base64Binary")
    List<byte[]> lableData;
}
