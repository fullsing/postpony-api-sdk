package com.postpony.common;

public class ClientConfiguration {
   // public final String DefaultBaseUrl = "https://apitest.postpony.com";

    /// <summary>
    /// The API key to use on per-request basis
    /// </summary>
    private String apiKey;

    public String getApiKey() {
        return apiKey;
    }

    public String getApiSecret() {
        return apiSecret;
    }

    public String getApiUrl() {
        return apiUrl;
    }

    /// <summary>
    /// The API Secret to use on per-request basis
    /// </summary>
    private String apiSecret;


    public void setApiUrl(String apiUrl) {
        this.apiUrl = apiUrl;
    }

    /// <summary>
    /// The API base URI to use on a per-request basis
    /// </summary>
    private String apiUrl;

    /// <summary>
    /// Create a ClientConfiguration instance
    /// </summary>
    /// <param name="apiKey">The API key to use for the client connection</param>
    /// <param name="apiSecret"></param>
    public ClientConfiguration(String apiKey, String apiSecret) {
        this(apiKey, apiSecret,"https://apitest.postpony.com");
        //this.ApiBase=DefaultBaseUrl;
    }

    /// <summary>
    /// Create an ClientConfiguration instance
    /// </summary>
    /// <param name="apiKey">The API key to use for the client connection</param>
    /// <param name="apiBase">The base API url to use for the client connection</param>
    public ClientConfiguration(String apiKey, String apiSecret, String apiUrl) {
        this.apiKey = apiKey;
        this.apiSecret = apiSecret;
        this.apiUrl = apiUrl;
    }

}