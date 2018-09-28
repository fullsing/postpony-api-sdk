package com.postpony;

import com.postpony.common.JabxXmlUtil;
import com.postpony.common.Request;
import com.postpony.model.*;

public class PostponyApiService {
    /// <summary>
    /// ��ȡ���������б�
    /// </summary>
    /// <param name="rateRequest"></param>
    /// <returns></returns>
    public static RateResponse getRate(RateRequest rateRequest)
    {
        try {
            Request request = new Request("api/rate");
            String result = request.Execute(rateRequest);
            return JabxXmlUtil.fromXML(result,RateResponse.class);
        }catch (Exception ex){
            RateResponse response=new RateResponse();
            response.setMsg(ex.getMessage());
            return response;
        }
    }

    /// <summary>
    /// �ύһ�����������浥
    /// </summary>
    /// <param name="rateRequest"></param>
    /// <returns></returns>
    public static ShipResponse ship(ShipRequest rateRequest)
    {
        try{
            Request request = new Request("api/ship");
            String result = request.Execute(rateRequest);
            return JabxXmlUtil.fromXML(result,ShipResponse.class);
        }catch (Exception ex)
        {
            ShipResponse response=new ShipResponse();
            response.setMsg(ex.getMessage());
            return response;
        }

    }

    /// <summary>
    /// ��������
    /// </summary>
    /// <param name="rateRequest"></param>
    /// <returns></returns>
    public static TrackingResponse getTracking(TrackingRequest trackRequest)
    {
        try{
            Request request = new Request("api/Tracking");
            String  result = request.Execute(trackRequest);
            return JabxXmlUtil.fromXML(result,TrackingResponse.class);
        }catch (Exception ex){
            TrackingResponse response=new TrackingResponse();
            response.setMsg(ex.getMessage());
            return response;
        }

    }


    /// <summary>
    /// �浥����
    /// </summary>
    /// <param name="downRequest"></param>
    /// <returns></returns>
    public static DownLoadRespose downloading(DownloadRequest downRequest)
    {
        try{
            Request request = new Request("api/Download");
            String result = request.Execute(downRequest);
            return JabxXmlUtil.fromXML(result,DownLoadRespose.class);
        }catch (Exception ex){

            DownLoadRespose response=new DownLoadRespose();
            response.setMsg(ex.getMessage());
            return response;
        }

    }

    /// <summary>
    /// ����Orderid��ȡ��Ӧ��labelId
    /// </summary>
    /// <param name="labelIdRequest"></param>
    /// <returns></returns>
    public static LabelIdRespose getLabelInfo(LabelIdRequest labelIdRequest)
    {
        try{
            Request request = new Request("/api/GetLabelId");
            String  result = request.Execute(labelIdRequest);
            return JabxXmlUtil.fromXML(result,LabelIdRespose.class);
        }catch (Exception ex){
            LabelIdRespose response=new LabelIdRespose();
            response.setMsg(ex.getMessage());
            return response;
        }

    }

    /// <summary>
    /// ����labelid���������浥�����������һ���浥�ϲ�֮���pdf��������
    /// </summary>
    /// <param name="downLoadRequest"></param>
    /// <returns></returns>
    public static BatchDownLoadRespose batchDownload(BatchDownloadRequest downLoadRequest)
    {
        try{
            Request request = new Request("/api/BatchDownload");
            String result = request.Execute(downLoadRequest);
            return JabxXmlUtil.fromXML(result,BatchDownLoadRespose.class);
        } catch (Exception ex){
            BatchDownLoadRespose response=new BatchDownLoadRespose();
            response.setMsg(ex.getMessage());
            return response;
        }

    }


    /// <summary>
    /// ����labelid��ȡ�浥������
    /// </summary>
    /// <param name="detailRequest"></param>
    /// <returns></returns>
    public static ShippingDetailResponse getShipDetail(ShippingDetailRequest detailRequest)
    {
        try{
            Request request = new Request("/api/ShippingDetailV2");
            String result = request.Execute(detailRequest);
            return JabxXmlUtil.fromXML(result,ShippingDetailResponse.class);
        }catch (Exception ex){
            ShippingDetailResponse response=new ShippingDetailResponse();
            response.setMsg(ex.getMessage());
            return response;
        }

    }
}
