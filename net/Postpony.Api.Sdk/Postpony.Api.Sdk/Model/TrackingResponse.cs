using System.Collections.Generic;

namespace Postpony.Api.Sdk.Model
{
    public class TrackingResponse:ResponseBase
    {
        public List<TrackingDetail> TrackingData { get; set; }

    }
}
