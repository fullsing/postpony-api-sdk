package com.postpony.model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="DownloadRequest")
public class DownloadRequest extends ClientRequestCom {

    public int getLabelId() {
        return labelId;
    }

    public void setLabelId(int labelId) {
        this.labelId = labelId;
    }

    public String getLabelFormatType() {
        return labelFormatType;
    }

    public void setLabelFormatType(String labelFormatType) {
        this.labelFormatType = labelFormatType;
    }

    @XmlElement(name = "LabelId")
    private int labelId;

    @XmlElement(name = "LabelFormatType")
    private String labelFormatType;
}
