using System.Collections.Generic;

namespace Postpony.Api.Sdk.Common
{
    public class Error : Resource
    {
        public string code { get; set; }
        public string field { get; set; }
        public string suggestion { get; set; }
        public string message { get; set; }
        public List<Error> errors { get; set; }

        public new static T Load<T>(string xml) where T : Resource
        {
            return XmlUtilHelper.DeSerializedEntity<T>(xml);
        }
    }
}
