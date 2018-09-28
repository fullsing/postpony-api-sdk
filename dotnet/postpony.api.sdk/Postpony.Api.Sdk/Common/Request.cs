using System;
using Postpony.Api.Sdk.Model;

namespace Postpony.Api.Sdk.Common
{
    public class Request
    {
        private string _url;

        public Request(string url)
        {
            _url = url;
        }

        public string Execute<T>(T obj) where T : ClientRequestBase
        {
            var client = ClientManager.Build();
            if (string.IsNullOrEmpty(client.configuration.ApiBase) )
                throw new ArgumentException("未配置服务请求地址，请通过调用ClientManager.SetCurrent方法配置服务请求地址");
            client.configuration.ApiBase = $"{client.configuration.ApiBase}/{_url}";
            return client.Execute<T>(obj);
        }

    }
}
