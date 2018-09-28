package com.postpony.common;

public class ClientManager {

    private static Client getCurrent;

    public static Client Build()
    {
        if (getCurrent == null)
        {
            String errMsg="未初始化账号信息，请通过调用ClientManager.SetCurrent方法配置账号信息";
            System.out.println(errMsg);
            throw new IllegalArgumentException(errMsg);
        }


        return getCurrent;
    }

    public static void SetCurrent(String apiKey,String apiSecret,String apibaseurl)
    {
        getCurrent=new Client(new ClientConfiguration(apiKey,apiSecret,apibaseurl));
        SetCurrent(getCurrent);
    }

    public static void SetCurrent(Client getClient)
    {
        getCurrent = getClient;
    }
}
