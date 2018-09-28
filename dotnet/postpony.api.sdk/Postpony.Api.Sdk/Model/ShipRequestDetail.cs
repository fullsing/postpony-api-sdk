using System.Collections.Generic;
using Postpony.Api.Sdk.Enum;

namespace Postpony.Api.Sdk.Model
{
    public class ShipRequestDetail
    {
        /// <summary>
        /// 发件人信息
        /// </summary>
        public AddressInfo Shipper { set; get; }

        /// <summary>
        /// 收件人信息
        /// </summary>
        public AddressInfo Recipient { set; get; }

        /// <summary>
        /// 运单其他信息
        /// </summary>
        public WaybillInformation Package { set; get; }


        /// <summary>
        /// 包裹列表
        /// </summary>
        public List<PackageItemInfo> PackageItems { set; get; }

        /// <summary>
        /// 申报价值列表
        /// </summary>
        public List<CustomsItem> CustomsList { set; get; }

        /// <summary>
        /// 面单尺寸规格
        /// </summary>
        public string LbSize { set; get; }


        /// <summary>
        /// 签名类型
        /// </summary>
        public SignatureType Signature { set; get; }
    }
}
