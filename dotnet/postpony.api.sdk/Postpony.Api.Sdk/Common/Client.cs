using System;
using System.IO;
using System.Net;
using System.Text;
using Postpony.Api.Sdk.Model;

namespace Postpony.Api.Sdk.Common
{
    public class Client
    {

        internal ClientConfiguration configuration;
        internal Client(ClientConfiguration clientConfiguration)
        {
            System.Net.ServicePointManager.SecurityProtocol = Security.GetProtocol();

            if (clientConfiguration == null) throw new ArgumentNullException("clientConfiguration");
            configuration = clientConfiguration;
        }
        private void PrepareRequest(ClientRequestBase request)
        {
            request.UserCredential=new ApiCredentialInfo();
            request.UserCredential.Key = configuration.ApiKey;
            request.UserCredential.Pwd = configuration.ApiSecret;
        }


        public string Execute<T>(T obj) where T:ClientRequestBase
        {
            PrepareRequest(obj);
            var request = XmlUtilHelper.SerializedEntity(obj);
            return Execute(request);
        }

        private string Execute(ClientRequestBase request)
        {
            return Execute(XmlUtilHelper.SerializedEntity(request));
        }


        public string Execute(string postData)
        {
            System.Net.ServicePointManager.SecurityProtocol = Security.GetProtocol();
            var req = (HttpWebRequest)WebRequest.Create(configuration.ApiBase);
            string retString = string.Empty;
            req.Credentials = CredentialCache.DefaultCredentials;
            req.Method = "POST";
            req.ContentType = "Application/xml";
            Stream requestStream = req.GetRequestStream();
            byte[] data = Encoding.UTF8.GetBytes(postData);
            requestStream.Write(data, 0, data.Length);
            requestStream.Close();
            try
            {
                var response = (HttpWebResponse)req.GetResponse();
                Stream myResponseStream = response.GetResponseStream();
                StreamReader myStreamReader = new StreamReader(myResponseStream, Encoding.UTF8);
                retString = myStreamReader.ReadToEnd();
                myStreamReader.Close();
                myResponseStream.Close();
            }
            catch (WebException e)
            {
                var wenReq = (HttpWebResponse)e.Response;
                using (StreamReader sr = new StreamReader(wenReq.GetResponseStream(), Encoding.UTF8))
                {
                    retString = sr.ReadToEnd();
                }
            }
            return retString;
        }
    }
}
