package com.postpony.model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="ShipRequest")
public class ShipRequest extends ClientRequestCom{

    public ShipRequestDetail getRequstInfo() {
        return requstInfo;
    }

    public void setRequstInfo(ShipRequestDetail requstInfo) {
        this.requstInfo = requstInfo;
    }

    public String getShipType() {
        return shipType;
    }

    public void setShipType(String shipType) {
        this.shipType = shipType;
    }

    public String getLabelFormatType() {
        return labelFormatType;
    }

    public void setLabelFormatType(String labelFormatType) {
        this.labelFormatType = labelFormatType;
    }

    public String getAuthorizedKey() {
        return authorizedKey;
    }

    public void setAuthorizedKey(String authorizedKey) {
        this.authorizedKey = authorizedKey;
    }

    public boolean isNoBackData() {
        return noBackData;
    }

    public void setNoBackData(boolean noBackData) {
        this.noBackData = noBackData;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    /// <summary>
    /// 详情
    /// </summary>
    @XmlElement(name = "RequstInfo")
    ShipRequestDetail requstInfo;

    /// <summary>
    /// 渠道编码
    /// </summary>
    @XmlElement(name = "ShipType")
    String shipType;

    /// <summary>
    /// 面单格式(PNG|PDF)
    /// </summary>
    @XmlElement(name = "LabelFormatType")
    String labelFormatType;

    /// <summary>
    /// api对接公司的授权key
    /// </summary>
    @XmlElement(name = "AuthorizedKey")
    String authorizedKey;

    /// <summary>
    /// 是否需要返回面单数据
    /// </summary>
    @XmlElement(name = "NoBackData")
    boolean noBackData;

    /// <summary>
    /// 标识第三方提交的唯一性，可用于控制重复提交同一面单
    /// </summary>
    @XmlElement(name = "OrderId")
    String orderId;
}
