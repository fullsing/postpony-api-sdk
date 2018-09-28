using System;

namespace Postpony.Api.Sdk.Model
{
    public class WaybillInformation
    {

        public DateTime ShipDate { set; get; }

        public string InvoiceNumber { set; get; }

        public string FTRCode { set; get; }

        public string ShippingNotes { set; get; }

        public string CustomerReference { set; get; }

        public string ContentsType { set; get; }
    }
}
