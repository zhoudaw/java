package com.zdw.java;

import org.junit.Test;

import java.io.*;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;


public class TCPTest2 {
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
        //5.
        fis.close();
        os.close();
        socket.close();

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
        FileOutputStream fos = new FileOutputStream(new File("xjj1.png"));
        //5
        byte[] buffer = new byte[1024];
        int len;
        while ((len = is.read(buffer)) != -1) {
            fos.write(buffer, 0, len);
        }
        fos.close();
        is.close();
        ss.close();
    }
}
