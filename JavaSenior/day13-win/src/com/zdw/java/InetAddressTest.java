package com.zdw.java;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 *
 * 一,网络编程中的两个主要的问题
 * 2.如何准确的定位网络上一台或多台主机；定位主机上的特定的应用
 * 3.找到主机后如何可靠的高效地进行数据传输
 *二,网络编程中的两个要素
 * 1.对应问题一：IP和端口
 * 2.对应问题二：提供网络通信协议：tcp/ip参数模型（应用层，传输层，网络层，物理+数据链接层）
 *
 *
 */
public class InetAddressTest {
    public static void main(String[] args) {
        try {
            InetAddress inet1 = InetAddress.getByName("192.168.177.17");
            InetAddress inet2 = InetAddress.getByName("www.baidu.com");
            InetAddress inet3 = InetAddress.getByName("127.0.0.1");
            System.out.println(inet2);
            System.out.println(inet1);
            System.out.println(inet3);
            System.out.println(InetAddress.getLocalHost());


        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
    }
}
