namespace Postpony.Api.Sdk.Model
{
    public class ShipRequest: ClientRequestBase
    {

        /// <summary>
        /// 详情
        /// </summary>
        public ShipRequestDetail RequstInfo { set; get; }

        /// <summary>
        /// 渠道编码
        /// </summary>
        public string ShipType { set; get; }

        /// <summary>
        /// 面单格式(PNG|PDF)
        /// </summary>
        public string LabelFormatType { set; get; }

        /// <summary>
        /// api对接公司的授权key
        /// </summary>
        public string AuthorizedKey { set; get; }

        /// <summary>
        /// 是否需要返回面单数据
        /// </summary>
        public bool NoBackData { set; get; }

        /// <summary>
        /// 标识第三方提交的唯一性，可用于控制重复提交同一面单
        /// </summary>
        public string OrderId { set; get; }

    }
}
