using System.Collections.Generic;
using System.Xml.Serialization;

namespace Postpony.Api.Sdk.Model
{
    [XmlRoot("ShipResponse")]
   public  class ShipResponse:ResponseBase
    {

        public List<byte[]> LableDataList { set; get; }

        public List<PackageItemInfo> TrackNoList { set; get; }


        /// <summary>
        /// 主单号（相对于多包裹的情况 ）
        /// </summary>
        public string MainTrackingNum { set; get; }

        public int LabelId { get; set; }


        public decimal TotalFreight { set; get; }


        public string Code { set; get; }
    }
}
