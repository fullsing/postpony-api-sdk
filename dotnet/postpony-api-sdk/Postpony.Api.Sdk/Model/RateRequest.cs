using System.Collections.Generic;
using System.Xml.Serialization;

namespace Postpony.Api.Sdk.Model
{

    [XmlRoot("ShippingRatesRequest")]
    public class RateRequest :ClientRequestBase
    {

        /// <summary>
        /// 包裹信息
        /// </summary>
        public List<PackageItemInfo> PackageInfos { get; set; }

        /// <summary>
        /// 包裹发送起始地址
        /// </summary>
        public AddressInfo OriginalAddress { get; set; }

        /// <summary>
        /// 包裹发送目的地地址
        /// </summary>
        public AddressInfo DestinationAddress { get; set; }

        /// <summary>
        /// 是否获取Ups原价信息
        /// </summary>
        public bool CanGetBaseRate { set; get; }

        /// <summary>
        /// 是否获取ups渠道的报价信息
        /// </summary>
        public bool UpsRate { set; get; }
    }
}
