package com.postpony.model;

import javax.xml.bind.annotation.XmlElement;
import java.math.BigDecimal;

public class CustomsItem {

    /// <summary>
    /// 数量
    /// </summary>
    @XmlElement(name = "Quantity")
    public int quantity;

    /// <summary>
    /// 单价
    /// </summary>
    @XmlElement(name = "UnitPrice")
    public BigDecimal unitPrice;

    /// <summary>
    /// 描述
    /// </summary>
    @XmlElement(name = "Description")
    public String description;

    /// <summary>
    /// 重量
    /// </summary>
    @XmlElement(name = "Weight")
    public BigDecimal weight;

    /// <summary>
    /// 申报价值
    /// </summary>
    @XmlElement(name = "CustomsValue")
    public BigDecimal customsValue;

    /// <summary>
    /// 源产国
    /// </summary>
    @XmlElement(name = "CountryOfOrigin")
    public String countryOfOrigin;
}
