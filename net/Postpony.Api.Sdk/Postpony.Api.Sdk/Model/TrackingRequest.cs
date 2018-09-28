namespace Postpony.Api.Sdk.Model
{
    public class TrackingRequest:ClientRequestBase
    {

        /// <summary>
        /// LabelId
        /// </summary>
        public string LogisticsCode { set; get; }

        public string TrackNo { set; get; }
    }
}
