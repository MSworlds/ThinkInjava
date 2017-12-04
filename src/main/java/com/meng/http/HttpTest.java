package com.meng.http;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 * Created by Administrator on 2017/12/1.
 * http发送请求
 */
public class HttpTest {
    /**
     *get请求
     */
public static void get() throws IOException {



    URL url=new URL("http://www.baidu.com");
    HttpURLConnection conn=(HttpURLConnection)url.openConnection();
    conn.setConnectTimeout(5000);
    conn.setRequestMethod("POST");
    conn.setRequestProperty("1","2444441");
    System.out.println(conn.getResponseCode());



}

    public static void main(String[] args) throws IOException {
        get();
    }
}
