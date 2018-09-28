package com.postpony.model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@XmlRootElement(name="BatchDownloadRequest")
public class BatchDownloadRequest extends ClientRequestCom{

    public List<Integer> getLabelIds() {
        return labelIds;
    }

    public void setLabelIds(List<Integer> labelIds) {
        this.labelIds = labelIds;
    }

    /// <summary>
    /// labelId
    /// </summary>
    @XmlElementWrapper(name = "LabelIds")
    @XmlElement(name = "int")
    private List<Integer> labelIds;
}
