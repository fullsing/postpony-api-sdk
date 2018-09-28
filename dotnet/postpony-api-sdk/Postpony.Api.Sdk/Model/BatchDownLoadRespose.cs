using System.Collections.Generic;

namespace Postpony.Api.Sdk.Model
{
    public class BatchDownLoadRespose:ResponseBase
    {

        public List<int> FailedLabel { set; get; }

        public string PdfUrl { set; get; }

    }
}
