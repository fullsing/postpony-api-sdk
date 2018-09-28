package com.postpony.common;

import com.postpony.model.ClientRequestCom;

public class Request {

    private String _url;
    public Request(String url)
    {
        _url = url;
    }

    public <T extends ClientRequestCom> String Execute(T obj)
    {
        Client client = ClientManager.Build();
        String requestUrl=client.configuration.getApiUrl();
        if(requestUrl.equals("")){
            throw new IllegalArgumentException("未配置服务请求地址，请通过调用ClientManager.SetCurrent方法配置服务请求地址");
        }
        client.configuration.setApiUrl(requestUrl+"/"+_url);
        return client.Execute(obj);
    }
}
