package com.postpony.model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@XmlRootElement(name="BatchDownLoadRespose")
public class BatchDownLoadRespose extends ResponseBase {

    public List<Integer> getFailedLabel() {
        return failedLabel;
    }

    public void setFailedLabel(List<Integer> failedLabel) {
        this.failedLabel = failedLabel;
    }

    public String getPdfUrl() {
        return pdfUrl;
    }

    public void setPdfUrl(String pdfUrl) {
        this.pdfUrl = pdfUrl;
    }

    @XmlElementWrapper(name="FailedLabel")
    @XmlElement(name = "int")
    List<Integer> failedLabel;

    @XmlElement(name = "PdfUrl")
    String pdfUrl;
}
