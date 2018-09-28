package com.postpony.common;

import com.postpony.model.ApiCredentialInfo;
import com.postpony.model.ClientRequestCom;

class Client
{

     ClientConfiguration configuration;
    public Client(ClientConfiguration clientConfiguration)
    {
        if (clientConfiguration == null) throw new IllegalArgumentException("clientConfiguration");
        configuration = clientConfiguration;
    }
    private void PrepareRequest(ClientRequestCom request)
    {
        request.userCredential=new ApiCredentialInfo();
        request.userCredential.setKey(configuration.getApiKey());
        request.userCredential.setPwd(configuration.getApiSecret());
    }


    public <T extends ClientRequestCom> String Execute(T obj)
    {
        PrepareRequest(obj);
        String request = JabxXmlUtil.toXML(obj);
        return Execute(request);
    }



    public String Execute(String postData)
    {
        System.out.println("postUrl："+configuration.getApiUrl());
        System.out.println("post参数："+postData);
        String result=HttpUtil.sendPost(configuration.getApiUrl(),postData,"Application/xml");
        System.out.println("post返回结果："+result);
        return result;
    }
}
