namespace Postpony.Api.Sdk.Model
{
    public class RateResponse: ResponseBase
    {
        public RateResult Fedex { get; set; }
        public RateResult Usps { get; set; }

        public RateResult Ups { set; get; }

        public RateResult Dhl { set; get; }

    }




}