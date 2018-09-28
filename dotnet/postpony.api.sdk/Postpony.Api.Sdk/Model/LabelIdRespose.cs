using System.Collections.Generic;

namespace Postpony.Api.Sdk.Model
{
    public class LabelIdRespose: ResponseBase
    {
        

        public int LabelId { set; get; }

        public List<string> TrackNos { set; get; }

        public decimal Weight { set; get; }

        public decimal TotalFreight { set; get; }

        public string LabelUrl { set; get; }
    }
}
