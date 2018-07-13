package com.tobi;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;


public class TestMain {
    static String author="MIEzAKPSETSExDF9SOct6PGIYO9hPTEyNTM2MDQ0MjkmYj0maz1BS0lESFBKVllPSk1WUjlldzJpZDhSVkx4TVhYSXNIU245Z3kmdD0xNTMwNjA5NTAyJmU9MTUzMDkwOTUwMiZyPTE0ODk1NzE1ODY=";

    public static void main(String[] args){

        InputStream is=null;
        BufferedReader br=null;
        try {
            String urlStr="http://recognition.image.myqcloud.com/ocr/general?appid=1253604429&bucket=songsong&url=http://songsong-1253604429.picsh.myqcloud.com/1528685503(1).png";
            URL url=new URL(urlStr);
            HttpURLConnection conn= (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("POST");
            conn.setRequestProperty("host","recognition.image.myqcloud.com");
            conn.setRequestProperty("Content-Type","application/json");
            conn.setRequestProperty("Content-Length","187");
            conn.setRequestProperty("Authorization",author);
            conn.connect();
            if(conn.getResponseCode()==200){
                is=conn.getInputStream();
                br=new BufferedReader(new InputStreamReader(is,"utf-8"));
                StringBuffer sbf=new StringBuffer();
                String temp=null;
                while ((temp=br.readLine())!=null){
                    sbf.append(temp);
                    sbf.append("\r\n");
                }
                System.out.print(sbf.toString());
            }else{
                System.out.print(conn);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

//    public void dome() throws Exception {
//        CloseableHttpClient httpClient = HttpClients.createDefault();
//
//        String entityStr = null;
//        CloseableHttpResponse response = null;
//
//        try {
//
//            // 创建POST请求对象
//            HttpPost httpPost = new HttpPost("http://recognition.image.myqcloud.com/ocr/handwriting");
//
//            /*
//             * 添加请求参数
//             */
//            // 创建请求参数
//            List<NameValuePair> list = new LinkedList<>();
//            BasicNameValuePair param1 = new BasicNameValuePair("appid", "125220938");
//            BasicNameValuePair param2 = new BasicNameValuePair("bucket", "");
//            BasicNameValuePair param3 = new BasicNameValuePair("url",
//                    "http://oi4ty6vxc.bkt.clouddn.com/wangyiyunLOGE.png");
//            list.add(param1);
//            list.add(param2);
//            list.add(param3);
//            // 使用URL实体转换工具
//            UrlEncodedFormEntity entityParam = new UrlEncodedFormEntity(list, "UTF-8");
//            httpPost.setEntity(entityParam);
//
//            /*
//             * 添加请求头信息
//             */
//            httpPost.addHeader("host", "recognition.image.myqcloud.com");
//            httpPost.addHeader("Content-Type", "application/json");
//            httpPost.addHeader("authorization",
//                    "gekuLE8u+p+J7jHadlYhyJhgCyNhPTEyNTIyMDkzO"
//                            + "DEmYj1maWxlJms9QUtJRGM4VGNhTnZVbGJMdUlZeVVDaTNDU2drZEtxUDJmM"
//                            + "E5kJmU9MTUyNjk2NTA1OSZ0PTE1MjQJnU9MCZmPQ== ");
//            // 执行请求
//            response = httpClient.execute(httpPost);
//            // 获得响应的实体对象
//            HttpEntity entity = response.getEntity();
//            // 使用Apache提供的工具类进行转换成字符串
//            entityStr = EntityUtils.toString(entity, "UTF-8");
//
//            // System.out.println(Arrays.toString(response.getAllHeaders()));
//
//        } catch (ClientProtocolException e) {
//            System.err.println("Http协议出现问题");
//            e.printStackTrace();
//        } catch (IOException e) {
//            System.err.println("IO异常");
//            e.printStackTrace();
//        } finally {
//            // 释放连接
//            if (null != response) {
//                try {
//                    response.close();
//                    httpClient.close();
//                } catch (IOException e) {
//                    System.err.println("释放连接出错");
//                    e.printStackTrace();
//                }
//            }
//        }
//
//        // 打印响应内容
//        System.out.println(entityStr);
//    }
}
