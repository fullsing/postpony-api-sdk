using System.Collections.Generic;

namespace Postpony.Api.Sdk.Model
{
    public class RateResult:RateResponse
    {
        public List<RateResultDetail> Data { get; set; }

    }
}
