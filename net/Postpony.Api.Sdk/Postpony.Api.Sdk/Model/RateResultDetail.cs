using Postpony.Api.Sdk.Enum;

namespace Postpony.Api.Sdk.Model
{
    public class RateResultDetail
    {
        public ShipTypeEnum ShipType { get; set; }
        public decimal ShippingBaseRate { get; set; }
        public decimal Price { get; set; }
    }
}
