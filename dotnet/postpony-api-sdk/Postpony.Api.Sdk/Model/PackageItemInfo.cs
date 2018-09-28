namespace Postpony.Api.Sdk.Model
{
    public class PackageItemInfo
    {
        public int PackageId { set; get; }

        /// <summary>
        /// 注意单位是英寸
        /// </summary>
        public decimal Length { set; get; }

        /// <summary>
        /// 注意单位是英寸
        /// </summary>
        public decimal Width { set; get; }

        /// <summary>
        /// 注意单位是英寸
        /// </summary>
        public decimal Height { set; get; }


        /// <summary>
        /// 重量 注意单位是磅
        /// </summary>
        public decimal Weight { set; get; }

        /// <summary>
        /// 重量 注意单位是磅
        /// </summary>
        public decimal WeightOz { set; get; }

        /// <summary>
        /// 保险费
        /// </summary>
        public decimal Insurance { set; get; }

        /// <summary>
        /// 包裹跟踪号
        /// </summary>
        public string TrackNo { set; get; }


        /// <summary>
        /// usps指定规格盒子
        /// </summary>
        public string UspsMailpiece { set; get; }


        /// <summary>
        /// 是否购买postpony保险
        /// </summary>
        public bool IsOurInsurance { set; get; }
    }
}
