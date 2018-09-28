namespace Postpony.Api.Sdk.Common
{
    /// <summary>
    /// Provides configuration options for the REST client
    /// </summary>
    public class ClientConfiguration
    {
        internal const string DefaultBaseUrl = "https://apitest.postpony.com";

        /// <summary>
        /// The API key to use on per-request basis
        /// </summary>
        public string ApiKey { get; set; }


        /// <summary>
        /// The API Secret to use on per-request basis
        /// </summary>
        public string ApiSecret { get; set; }

        /// <summary>
        /// The API base URI to use on a per-request basis
        /// </summary>
        public string ApiBase { get; set; }

        /// <summary>
        /// Create a ClientConfiguration instance
        /// </summary>
        /// <param name="apiKey">The API key to use for the client connection</param>
        /// <param name="apiSecret"></param>
        public ClientConfiguration(string apiKey, string apiSecret) : this(apiKey,apiSecret,DefaultBaseUrl) { }

        /// <summary>
        /// Create an ClientConfiguration instance
        /// </summary>
        /// <param name="apiKey">The API key to use for the client connection</param>
        /// <param name="apiBase">The base API url to use for the client connection</param>
        public ClientConfiguration(string apiKey,string apiSecret, string apiBase)
        {
            ApiKey = apiKey;
            ApiSecret = apiSecret;
            ApiBase = apiBase;
        }
    }
}
