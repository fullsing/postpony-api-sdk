using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using Postpony.Api.Sdk.Common;
using Postpony.Api.Sdk.Model;

namespace Postpony.Api.Sdk
{
   public class PostponyApiService
    {


        /// <summary>
        /// 获取渠道报价列表
        /// </summary>
        /// <param name="rateRequest"></param>
        /// <returns></returns>
        public static RateResponse GetRate(RateRequest rateRequest)
        {
            var request = new Request("api/rate");
            var result = request.Execute(rateRequest);
            return XmlUtilHelper.DeSerializedEntity<RateResponse>(result);
        }

        /// <summary>
        /// 提交一个订单生成面单
        /// </summary>
        /// <param name="rateRequest"></param>
        /// <returns></returns>
        public static ShipResponse Ship(ShipRequest rateRequest)
        {
            var request = new Request("api/ship");
            var result = request.Execute(rateRequest);
            return XmlUtilHelper.DeSerializedEntity<ShipResponse>(result);
        }

        /// <summary>
        /// 物流跟踪
        /// </summary>
        /// <param name="rateRequest"></param>
        /// <returns></returns>
        public static TrackingResponse GetTracking(TrackingRequest rateRequest)
        {
            var request = new Request("api/Tracking");
            var result = request.Execute(rateRequest);
            return XmlUtilHelper.DeSerializedEntity<TrackingResponse>(result);
        }


        /// <summary>
        /// 面单下载
        /// </summary>
        /// <param name="downRequest"></param>
        /// <returns></returns>
        public static DownLoadRespose Downloading(DownloadRequest downRequest)
        {
            var request = new Request("api/Download");
            var result = request.Execute(downRequest);
            return XmlUtilHelper.DeSerializedEntity<DownLoadRespose>(result);
        }

        /// <summary>
        /// 根据Orderid获取对应的labelId
        /// </summary>
        /// <param name="labelIdRequest"></param>
        /// <returns></returns>
        public static LabelIdRespose GetLabelInfo(LabelIdRequest labelIdRequest)
        {
            var request = new Request("/api/GetLabelId");
            var result = request.Execute(labelIdRequest);
            return XmlUtilHelper.DeSerializedEntity<LabelIdRespose>(result);
        }

        /// <summary>
        /// 根据labelid批量下载面单。结果将返回一个面单合并之后的pdf下载连接
        /// </summary>
        /// <param name="downLoadRequest"></param>
        /// <returns></returns>
        public static BatchDownLoadRespose BatchDownload(BatchDownloadRequest downLoadRequest)
        {
            var request = new Request("/api/BatchDownload");
            var result = request.Execute(downLoadRequest);
            return XmlUtilHelper.DeSerializedEntity<BatchDownLoadRespose>(result);
        }


        /// <summary>
        /// 根据labelid获取面单的详情
        /// </summary>
        /// <param name="detailRequest"></param>
        /// <returns></returns>
        public static ShippingDetailResponse GetShipDetail(ShippingDetailRequest detailRequest)
        {
            var request = new Request("/api/ShippingDetailV2");
            var result = request.Execute(detailRequest);
            return XmlUtilHelper.DeSerializedEntity<ShippingDetailResponse>(result);
        }
    }
}
