namespace Postpony.Api.Sdk.Model
{
    public  class AddressInfo
    {
        /// <summary>
        /// 个人名称 
        /// </summary>
        public string PersonName { set; get; }

        /// <summary>
        /// 公司名称
        /// </summary>
        public string CompanyName { set; get; }

        /// <summary>
        /// 分机号
        /// </summary>
        public string Extension { set; get; }

        /// <summary>
        ///电话号码
        /// </summary>
        public string PhoneNumber { set; get; }


        /// <summary>
        /// 街道地址
        /// </summary>
        public string[] StreetLines { set; get; }


        /// <summary>
        /// 城市
        /// </summary>
        public string City { set; get; }

        /// <summary>
        /// 州编码，如果不存在州的国家，传省份名称即可
        /// </summary>
        public string StateOrProvinceCode { set; get; }

        /// <summary>
        /// 邮编
        /// </summary>
        public string PostalCode { set; get; }


        /// <summary>
        /// zip4
        /// </summary>
        public string Zip4 { set; get; }

        /// <summary>
        /// 国家二字码
        /// </summary>
        public string CountryCode { set; get; }

        /// <summary>
        /// 是否是家庭住址
        /// </summary>
        public bool? IsResidentialAddress { get; set; }

    }
}
