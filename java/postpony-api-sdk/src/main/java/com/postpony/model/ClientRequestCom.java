package com.postpony.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

@XmlAccessorType(XmlAccessType.FIELD)
public class ClientRequestCom {

    public ApiCredentialInfo getUserCredential() {
        return userCredential;
    }

    public void setUserCredential(ApiCredentialInfo userCredential) {
        this.userCredential = userCredential;
    }

    /// <summary>
    /// 用户账户信息
    /// </summary>
    @XmlElement(name = "UserCredential")
    public ApiCredentialInfo userCredential;
}
