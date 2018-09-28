package com.postpony.common;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import java.util.Map;

public class HttpUtil {





    public static String sendGet(String url, String param) {
        String result = "";
        BufferedReader in = null;
        try {
            String urlNameString = url + "?" + param;
            URL realUrl = new URL(urlNameString);
            // 打开和URL之间的连接
            URLConnection connection = realUrl.openConnection();
            // 设置通用的请求属性
            connection.setRequestProperty("accept", "*/*");
            connection.setRequestProperty("connection", "Keep-Alive");
            connection.setRequestProperty("user-agent",
                    "Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.1;SV1)");
            // 建立实际的连接
            connection.connect();
            // 获取所有响应头字段
            Map<String, List<String>> map = connection.getHeaderFields();
            // 遍历所有的响应头字段
            for (String key : map.keySet()) {
                System.out.println(key + "--->" + map.get(key));
            }
            // 定义 BufferedReader输入流来读取URL的响应
            in = new BufferedReader(new InputStreamReader(
                    connection.getInputStream()));
            String line;
            while ((line = in.readLine()) != null) {
                result += line;
            }
        } catch (Exception e) {
            System.out.println("发送GET请求出现异常！" + e);
            e.printStackTrace();
        }
        // 使用finally块来关闭输入流
        finally {
            try {
                if (in != null) {
                    in.close();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        return result;
    }

    /**
     * Get Request
     * @return
     * @throws Exception
     */
    public static String doGet(String url) {
        try{
            URL localURL = new URL(url);
            URLConnection connection = localURL.openConnection();
            HttpURLConnection httpURLConnection = (HttpURLConnection)connection;
            httpURLConnection.setRequestProperty("Accept-Charset", "utf-8");
            httpURLConnection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
            InputStream inputStream = null;
            InputStreamReader inputStreamReader = null;
            BufferedReader reader = null;
            StringBuffer resultBuffer = new StringBuffer();
            String tempLine = null;

            if (httpURLConnection.getResponseCode() >= 300) {
                throw new Exception("HTTP Request is not success, Response code is " + httpURLConnection.getResponseCode());
            }

            try {
                inputStream = httpURLConnection.getInputStream();
                inputStreamReader = new InputStreamReader(inputStream);
                reader = new BufferedReader(inputStreamReader);
                while ((tempLine = reader.readLine()) != null) {
                    resultBuffer.append(tempLine);
                }
            } finally {
                if (reader != null) {
                    reader.close();
                }
                if (inputStreamReader != null) {
                    inputStreamReader.close();
                }
                if (inputStream != null) {
                    inputStream.close();
                }
            }
            return resultBuffer.toString();
        }catch (Exception ex)
        {
            return ex.getMessage();
        }

    }

    public static String sendPost(String pathUrl, String requestString){
        return sendPost(pathUrl,requestString,"application/json");
    }

    public static String sendPost(String pathUrl, String requestString,String contentType) {
        // 建立连接
        try {
            URL url = new URL(pathUrl);
            HttpURLConnection httpUrlConnection = (HttpURLConnection) url.openConnection();
            // 设置连接属性
            httpUrlConnection.setDoOutput(true);// 使用 URL 连接进行输出
            httpUrlConnection.setDoInput(true);// 使用 URL 连接进行输入
            httpUrlConnection.setUseCaches(false);// 忽略缓存
            httpUrlConnection.setRequestMethod("POST");// 设置URL请求方法
            httpUrlConnection.setRequestProperty("CHARSET", "UTF-8");
            // 设置请求属性
            // 获得数据字节数据，请求数据流的编码，必须和下面服务器端处理请求流的编码一致
            byte[] requestStringBytes = requestString.getBytes("UTF-8");
            httpUrlConnection.setRequestProperty("Content-length", "" + requestStringBytes.length);
            httpUrlConnection.setRequestProperty("Content-Type", contentType);
            httpUrlConnection.setRequestProperty("Connection", "Keep-Alive");// 维持长连接
            httpUrlConnection.setRequestProperty("Charset", "UTF-8");

            // 建立输出流，并写入数据
            OutputStream outputStream = httpUrlConnection.getOutputStream();
            outputStream.write(requestStringBytes);
            outputStream.close();
            // 获得响应状态
            int responseCode = httpUrlConnection.getResponseCode();
            String readLine = null;
            StringBuffer sb = new StringBuffer();
            BufferedReader responseReader;
            // 处理响应流，必须与服务器响应流输出的编码一致

            if (HttpURLConnection.HTTP_OK == responseCode) {// 连接成功
                // 当正确响应时处理数据
                responseReader = new BufferedReader(new InputStreamReader(httpUrlConnection.getInputStream(), "UTF-8"));
                while ((readLine = responseReader.readLine()) != null) {
                    sb.append(readLine).append("\n");
                }
                responseReader.close();
                // 处理返回的参数
            }else
            {
                InputStream errorStream = httpUrlConnection.getErrorStream();

                if(errorStream != null)
                {
                    InputStreamReader inputStreamReader = new InputStreamReader(errorStream,"utf-8");
                    responseReader = new BufferedReader(inputStreamReader);
                    while ((readLine = responseReader.readLine()) != null) {
                        sb.append(readLine).append("\n");
                    }
                    responseReader.close();
                    inputStreamReader.close();
                }
                errorStream.close();
            }
            return sb.toString().replace("\uFEFF","");
        } catch (Exception e) {
            return e.getMessage();
        }
    }
}
