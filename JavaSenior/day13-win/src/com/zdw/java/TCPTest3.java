package com.zdw.java;

import org.junit.Test;

import java.io.*;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;


public class TCPTest3 {
    @Test
    public void client() throws IOException {
        //1.
        Socket socket = new Socket(InetAddress.getByName("127.0.0.1"), 9090);
        //2.
        OutputStream os = socket.getOutputStream();
        //3.

        FileInputStream fis = new FileInputStream(new File("xjj.png"));
        //4.
        byte[] buffer = new byte[1024];
        int len;
        while ((len = fis.read(buffer)) != -1) {
            os.write(buffer, 0, len);
        }
        //关闭数据输出
        socket.shutdownOutput();
        //5.接收来自服务器端的数据，并显示到控制台上
        InputStream is = socket.getInputStream();
        ByteArrayOutputStream baos =new ByteArrayOutputStream();
        byte[] buffer1 = new byte[20];
        int len1;
        while ((len1 = is.read(buffer)) != -1) {
            baos.write(buffer, 0, len1);
        }
        System.out.println(baos.toString());
        fis.close();
        os.close();
        socket.close();
        baos.close();

    }

    @Test
    public void server() throws IOException {
        //1
        ServerSocket ss = new ServerSocket(9090);
        //2
        Socket socket = ss.accept();
        //3
        InputStream is = socket.getInputStream();
        //4.
        FileOutputStream fos = new FileOutputStream(new File("xjj2.png"));
        //5
        byte[] buffer = new byte[1024];
        int len;
        while ((len = is.read(buffer)) != -1) {
            fos.write(buffer, 0, len);
        }
        //6.服务器端给予客户的反馈
        OutputStream os = socket.getOutputStream();
        os.write("你好，照片已收到，非常漂亮！".getBytes());
        fos.close();
        is.close();
        ss.close();
//        os.close();
    }
}
