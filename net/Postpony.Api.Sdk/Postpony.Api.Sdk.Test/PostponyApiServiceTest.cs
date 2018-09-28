using Postpony.Api.Sdk;
using System;
using System.Collections.Generic;
using Microsoft.VisualStudio.TestTools.UnitTesting;
using Postpony.Api.Sdk.Common;
using Postpony.Api.Sdk.Enum;
using Postpony.Api.Sdk.Model;

namespace Postpony.Api.Sdk.Test
{



    [TestClass()]
    public class PostponyApiServiceTest
    {

        [TestInitialize]
        public void Initialize()
        {
            //todo 账号信息需要通过postpony 客服或者 技术 获得。
            ClientManager.SetCurrent("", "", "");
        }

        [TestMethod()]
        public void GetRateTest()
        {
            try
            {
                var request = CreateRateRequest();
                var result = PostponyApiService.GetRate(request);
                Assert.AreEqual(result.Sucess, true);
                Assert.AreEqual(result.Fedex.Sucess, true);
                Assert.AreEqual(result.Ups.Sucess, true);
                Assert.AreEqual(result.Usps.Sucess, true);
                Assert.AreEqual(result.Dhl.Sucess, true);
            }
            catch (Exception ex)
            {

            }

        }

        [TestMethod()]
        public void ShipTest()
        {
            try
            {
                var result = PostponyApiService.Ship(CreateShipRequest());
                Assert.AreEqual(result.Sucess, true);
            }
            catch (Exception)
            {

                throw;
            }

        }

        private static ShipRequest CreateShipRequest()
        {
            ShipRequest shipRequest = new ShipRequest();
            shipRequest.RequstInfo = new ShipRequestDetail();
            shipRequest.RequstInfo.Shipper = new AddressInfo()
            {
                PersonName = "test",
                City = "Portland",
                PostalCode = "97230",
                StateOrProvinceCode = "OR",
                CountryCode = "US",
                StreetLines = new[] {"14121 NE Airport Way"},
                PhoneNumber = "2025551212",
            };
            shipRequest.RequstInfo.Recipient = new AddressInfo()
            {
                PersonName = "test",
                City = "Portland",
                PostalCode = "97230",
                StateOrProvinceCode = "OR",
                CountryCode = "US",
                StreetLines = new[] {"14121 NE Airport Way"},
                PhoneNumber = "2025551212",
            };

            shipRequest.RequstInfo.PackageItems = new List<PackageItemInfo>()
            {
                new PackageItemInfo() {Width = 1, Height = 1, Length = 1, Weight = 1}
            };
            shipRequest.AuthorizedKey = "TESTTOKEN-ske39De3mkC39d";
            shipRequest.LabelFormatType = "PDF";
            shipRequest.NoBackData = true;
            //orderid 是用于标识提交的订单的唯一性，会打印到面单上，orderid可为空
            // shipRequest.OrderId = "6666666666";


            shipRequest.ShipType = ShipTypeEnum.FedEx2Day.ToString();


            shipRequest.RequstInfo.LbSize = LabelSize.S4X6.ToString();
            shipRequest.RequstInfo.Package = new WaybillInformation();
            shipRequest.RequstInfo.Package.ShipDate = DateTime.Now.AddDays(2);

            //备注，会打印到面单上
            shipRequest.RequstInfo.Package.ShippingNotes = "testsetsetsetsteste";
            return shipRequest;
        }

        [TestMethod()]
        public void GetTrackingTest()
        {
            try
            {
                var request = new TrackingRequest()
                {
                    TrackNo = "9400110205425007474346",
                    LogisticsCode = ShippingClassEnum.Usps.ToString()
                };
                var result = PostponyApiService.GetTracking(request);
                Assert.AreEqual(result.Sucess, true);
            }
            catch (Exception ex)
            {
                throw;
            }
        }

        [TestMethod()]
        public void DownloadingTest()
        {
            try
            {
                var request = new DownloadRequest() {LabelId = 758631, LabelFormatType = LabelFormatEnum.PDF.ToString()};
                var result = PostponyApiService.Downloading(request);
                Assert.AreEqual(result.Sucess, true);
            }
            catch (Exception ex)
            {
                throw;
            }

        }

        [TestMethod()]
        public void GetLabelInfoTest()
        {
            try
            {
                var request = new LabelIdRequest() {OrderId = "L-21-2560666"};
                var result = PostponyApiService.GetLabelInfo(request);
                Assert.AreEqual(result.Sucess, true);
            }
            catch (Exception ex)
            {
                throw;
            }
        }

        [TestMethod()]
        public void BatchDownloadTest()
        {
            try
            {
                var request = new BatchDownloadRequest() { LabelIds = new List<int>() { 758631, 758645 } };
                var result = PostponyApiService.BatchDownload(request);
                Assert.AreEqual(result.Sucess, true);
            }
            catch (Exception ex)
            {
                throw;
            }
        }

        private RateRequest CreateRateRequest()
        {
            RateRequest rateRequest = new RateRequest();
            rateRequest.CanGetBaseRate = false;
            rateRequest.OriginalAddress = new AddressInfo()
            {
                PersonName = "test",
                City = "Portland",
                PostalCode = "97230",
                StateOrProvinceCode = "OR",
                CountryCode = "US",
                PhoneNumber = "2025551212",
                StreetLines = new[] { "14121 NE Airport Way" },
            };
            rateRequest.DestinationAddress = new AddressInfo()
            {
                PersonName = "test",
                City = "Portland",
                PostalCode = "97230",
                StateOrProvinceCode = "OR",
                CountryCode = "US",

                PhoneNumber = "2025551212",
                StreetLines = new[] { "14121 NE Airport Way" },
            };

            rateRequest.PackageInfos = new List<PackageItemInfo>()
            {
                new PackageItemInfo() {Width=1,Height = 1,Length = 1,Weight = 1}
            };
            rateRequest.UpsRate = true;
            return rateRequest;
        }

        [TestMethod()]
        public void GetShipDetailTest()
        {
            var request = new ShippingDetailRequest() { LabelId = 765361};
            var result = PostponyApiService.GetShipDetail(request);
            Assert.AreEqual(result.Sucess, true);
        }
    }
}