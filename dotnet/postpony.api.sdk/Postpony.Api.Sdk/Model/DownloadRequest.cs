namespace Postpony.Api.Sdk.Model
{
    public class DownloadRequest:ClientRequestBase
    {
        public int LabelId { set; get; }

        public string LabelFormatType { set; get; }
    }
}
