using System.Collections.Generic;

namespace Postpony.Api.Sdk.Model
{
    public class DownLoadRespose:ResponseBase
    {
        public List<byte[]> LableData { set; get; }
    }
}
