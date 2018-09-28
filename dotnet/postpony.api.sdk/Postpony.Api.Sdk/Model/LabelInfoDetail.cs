using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace Postpony.Api.Sdk.Model
{
    public class LabelInfoDetail
    {
        public AddressInfo Shipper { set; get; }

        public AddressInfo Recipient { set; get; }

        public string LabelSize { set; get; }

        public int LabelId { set; get; }

        /// <summary>
        /// LabelTotal
        /// </summary>
        public decimal LabelTotal { set; get; }

        public string ShipType { set; get; }


        /// <summary>
        /// 包裹列表
        /// </summary>
        public List<PackageItemInfo> PackageItems { set; get; }

        public DateTime ShipDate { set; get; }
    }
}
