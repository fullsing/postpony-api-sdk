using System;

namespace Postpony.Api.Sdk.Common
{
    public class ClientManager
    {
        private static Func<Client> getCurrent;

        internal static Client Build()
        {
            if (getCurrent == null)
                throw new ArgumentException("未初始化账号信息，请通过调用ClientManager.SetCurrent方法配置账号信息");
            return getCurrent();
        }

        public static void SetCurrent(string apiKey,string apiSecret,string apibaseurl)
        {
            SetCurrent(() => new Client(new ClientConfiguration(apiKey,apiSecret,apibaseurl)));
        }

        public static void SetCurrent(Func<Client> getClient)
        {
            getCurrent = getClient;
        }
    }
}
