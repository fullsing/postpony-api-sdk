using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Xml.Serialization;

namespace Postpony.Api.Sdk.Model
{
    [XmlRoot("ShippingDetailResponseV2")]
    public class ShippingDetailResponse:ResponseBase
    {

        public LabelInfoDetail Detail { set; get; }

    }
}
