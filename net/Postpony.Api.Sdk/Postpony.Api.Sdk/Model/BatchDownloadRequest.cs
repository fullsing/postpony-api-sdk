using System.Collections.Generic;

namespace Postpony.Api.Sdk.Model
{
    public class BatchDownloadRequest:ClientRequestBase
    {

        /// <summary>
        /// labelId
        /// </summary>
        public List<int> LabelIds { set; get; }
    }
}
