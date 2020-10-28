package com.zou;

import java.net.InetAddress;
import java.net.UnknownHostException;

// 测试IP
public class ip {
    public static void main(String[] args) {
        try {
            InetAddress inetAddress = InetAddress.getByName("localhost");
            System.out.println(inetAddress);
            InetAddress inetAddress1 = InetAddress.getByName("www.baidu.com");
            System.out.println(inetAddress1);
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
    }
}
