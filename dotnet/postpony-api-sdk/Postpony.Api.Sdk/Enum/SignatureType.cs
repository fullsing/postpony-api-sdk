namespace Postpony.Api.Sdk.Enum
{
    public enum SignatureType
    {
        None = 0,

        /// <summary>
        /// fedex 有三种签名方式
        /// </summary>
        Adult = 1,
        Direct = 2,
        Indirect = 3,

        /// <summary>
        /// USPS
        /// </summary>
        SignatureConfirmation = 4,

        /// <summary>
        /// ups 签名
        /// </summary>
        Signature = 5,

        AdultSignature = 6,
    }
}
