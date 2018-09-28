using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace Postpony.Api.Sdk.Model
{
   public class ShippingDetailRequest:ClientRequestBase
    {
        public int LabelId { get; set; }
    }
}
