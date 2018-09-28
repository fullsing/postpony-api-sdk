package com.postpony;


import com.postpony.common.ClientManager;
import com.postpony.common.JabxXmlUtil;
import com.postpony.model.*;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

class PostponyApiServiceTest {

    public PostponyApiServiceTest()
    {
        //账号信息可通过postpony客服或技术获取
        ClientManager.SetCurrent("","","");
    }

    @org.junit.jupiter.api.Test
    void getRate() {
        try{
            RateRequest request=createRateRequest();

            RateResponse response= PostponyApiService.getRate(request);
            if(response.getFedex().isSucess()==true)
            {
                System.out.println("fedex获取报价成功");
            }
            if(response.getUsps().isSucess()==true)
            {
                System.out.println("usps获取报价成功");
            }


            if(response.getUps().isSucess()==true)
            {
                System.out.println("ups获取报价成功");
            }

            if(response.getDhl().isSucess()==true)
            {
                System.out.println("dhl获取报价成功");
            }
        }catch (Exception ex){

        }
        //ClientManager.SetCurrent("PY","pypypypypy","https://apitest.postpony.com/");

    }

    @org.junit.jupiter.api.Test
    void ship() {

        ShipRequest request=CreateShipRequest();
        ShipResponse response= PostponyApiService.ship(request);
        if(response.isSucess()){
            System.out.println("生成面单成功");
            CreateFile(response.getLableDataList().get(0));
        }
    }

    @org.junit.jupiter.api.Test
    void getTracking() {
        TrackingRequest request = new TrackingRequest();
        request.setLogisticsCode(ShippingClassEnum.Usps.toString());
        request.setTrackNo("9400110205425007474346");
        TrackingResponse result = PostponyApiService.getTracking(request);
        if(result.isSucess()){
            System.out.println("物流跟踪信息获取成功");
        }
    }

    @org.junit.jupiter.api.Test
    void downloading() {
        DownloadRequest request = new DownloadRequest();
        request.setLabelFormatType("PDF");
        request.setLabelId(768208);
        DownLoadRespose result = PostponyApiService.downloading(request);
        if(result.isSucess()){
            System.out.println("面单下载成功");
        }
    }

    @org.junit.jupiter.api.Test
    void getLabelInfo() {
        LabelIdRequest request = new LabelIdRequest();
        request.setOrderId("dk8391kdk28dk3dddd902k2");
        LabelIdRespose result = PostponyApiService.getLabelInfo(request);
        if(result.isSucess()){
            System.out.println("根据订单号获取label信息成功");
        }
    }

    @org.junit.jupiter.api.Test
    void batchDownload() {
        BatchDownloadRequest request = new BatchDownloadRequest();
        request.setLabelIds(new ArrayList<Integer>());
        request.getLabelIds().add(768208);
        request.getLabelIds().add(768209);
        BatchDownLoadRespose result = PostponyApiService.batchDownload(request);
        if(result.isSucess())
        {
            System.out.println("批量生成面单成功，面单下载地址："+result.getPdfUrl());
        }
    }

    @org.junit.jupiter.api.Test
    void getShipDetail() {
        ShippingDetailRequest request = new ShippingDetailRequest();
        request.setLabelId(768208);

        ShippingDetailResponse result = PostponyApiService.getShipDetail(request);
        if(result.isSucess()){
            System.out.println("label信息查询成功");
        }
    }

    private RateRequest createRateRequest()
    {
        RateRequest rateRequest = new RateRequest();
        rateRequest.setCanGetBaseRate(false);
        rateRequest.setOriginalAddress(new AddressInfo());
        rateRequest.getOriginalAddress().setPersonName("test");
        rateRequest.getOriginalAddress().setCity("Portland");
        rateRequest.getOriginalAddress().setPostalCode("97230");
                rateRequest.getOriginalAddress().setStateOrProvinceCode("OR");
                rateRequest.getOriginalAddress().setCountryCode("US");
                rateRequest.getOriginalAddress().setPhoneNumber("2025551212");
                rateRequest.getOriginalAddress().setStreetLines(new String[]{ "14121 NE Airport Way" });
        rateRequest.setDestinationAddress(new AddressInfo());
        rateRequest.getDestinationAddress().setPersonName( "test");
        rateRequest.getDestinationAddress().setCity( "Portland");
        rateRequest.getDestinationAddress().setPostalCode( "97230");
        rateRequest.getDestinationAddress().setStateOrProvinceCode( "OR");
        rateRequest.getDestinationAddress().setCountryCode( "US");

        rateRequest.getDestinationAddress().setPhoneNumber( "2025551212");
        rateRequest.getDestinationAddress().setStreetLines( new String [] { "14121 NE Airport Way" });

        rateRequest.setPackageInfos(new ArrayList<PackageItemInfo>());
        PackageItemInfo packageitem= new PackageItemInfo();
        packageitem.setHeight(new BigDecimal(1));
        packageitem.setWeight(new BigDecimal(1));
        packageitem.setWidth(new BigDecimal(1));
        packageitem.setLength(new BigDecimal(1));
        rateRequest.getPackageInfos().add(packageitem);

        rateRequest.setUpsRate(true);
        return rateRequest;
    }

    private static ShipRequest CreateShipRequest()
    {
        ShipRequest shipRequest = new ShipRequest();
        ShipRequestDetail requstInfo=new ShipRequestDetail();
        AddressInfo shipper = new AddressInfo();
        shipper.setPersonName("test");
        shipper.setCity("Portland");
        shipper.setStateOrProvinceCode("OR");
        shipper.setPostalCode("97230");
        shipper.setCountryCode("US");
        shipper.setPhoneNumber("2025551212");
        shipper.setStreetLines(new String[]{"14121 NE Airport Way"});
        requstInfo.setShipper(shipper);

        AddressInfo recipient = new AddressInfo();
        recipient.setPersonName("test");
        recipient.setCity("Portland");
        recipient.setStateOrProvinceCode("OR");
        recipient.setPostalCode("97230");
        recipient.setCountryCode("US");
        recipient.setPhoneNumber("2025551212");
        recipient.setStreetLines(new String[]{"14121 NE Airport Way"});
        requstInfo.setRecipient(recipient);

        List<PackageItemInfo> packageItemInfos=new ArrayList<PackageItemInfo>();

        for (int i=0;i<2;i++){
            PackageItemInfo item=new PackageItemInfo();
            item.setWidth(new BigDecimal(1));
            item.setHeight(new BigDecimal(1));
            item.setLength(new BigDecimal(1));
            item.setWeight(new BigDecimal(1));
            packageItemInfos.add(item);
        }
        requstInfo.setPackageItems(packageItemInfos);
        requstInfo.setPackageItems(packageItemInfos);
        shipRequest.setAuthorizedKey("TESTTOKEN-ske39De3mkC39d");
        shipRequest.setLabelFormatType("PDF");
        shipRequest.setNoBackData(false);
        //orderid 是用于标识提交的订单的唯一性，会打印到面单上，orderid可为空
        //  shipRequest.OrderId = "9387291183320111";


        shipRequest.setShipType(ShipTypeEnum.UpsGround.toString());


        requstInfo.setLbSize(LabelSize.S4X6.toString());
        WaybillInformation waybillInformation=new WaybillInformation();
        Date date=new Date();
        SimpleDateFormat dateFormat=new SimpleDateFormat("yyyy-MM-dd");
        waybillInformation.shipDate = dateFormat.format(date);
        requstInfo.setPackageInfo(waybillInformation);
        //备注，会打印到面单上
        waybillInformation.setShippingNotes("testsetsetsetsteste");
        requstInfo.setPackageInfo(waybillInformation);
        shipRequest.setRequstInfo(requstInfo);
        shipRequest.setOrderId("dk8391kdk22dddd902k2");
        return shipRequest;
    }

    private void CreateFile(byte[] data)
    {
        try{
            String filePath="/Users/liyoujin/testpdf/javatest.pdf";
            BufferedOutputStream bos = null;
            FileOutputStream fos = null;
            File file = null;
            try {
                file = new File(filePath);
                fos = new FileOutputStream(file);
                bos = new BufferedOutputStream(fos);
                bos.write(data);
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                if (bos != null) {
                    try {
                        bos.close();
                    } catch (IOException e1) {
                        e1.printStackTrace();
                    }
                }
                if (fos != null) {
                    try {
                        fos.close();
                    } catch (IOException e1) {
                        e1.printStackTrace();
                    }
                }
            }
        }catch (Exception ex)
        {

        }

    }
}