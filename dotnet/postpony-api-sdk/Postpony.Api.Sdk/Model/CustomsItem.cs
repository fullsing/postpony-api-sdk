namespace Postpony.Api.Sdk.Model
{
    public class CustomsItem
    {
        /// <summary>
        /// 数量
        /// </summary>
        public int Quantity { set; get; }

        /// <summary>
        /// 单价
        /// </summary>
        public decimal UnitPrice { set; get; }

        /// <summary>
        /// 描述
        /// </summary>
        public string Description { set; get; }

        /// <summary>
        /// 重量
        /// </summary>
        public decimal Weight { set; get; }

        /// <summary>
        /// 申报价值
        /// </summary>
        public decimal CustomsValue { set; get; }

        /// <summary>
        /// 源产国
        /// </summary>
        public string CountryOfOrigin { set; get; }

    }
}
