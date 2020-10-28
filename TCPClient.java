package com.zou;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class TCPClient {
    public static void main(String[] args) throws IOException {
        // 1. 要知道服务器地址
        InetAddress localhost = InetAddress.getByName("localhost");
        int port = 9999;
        // 2, 创建一个socket连接
        Socket socket = new Socket("localhost", 9999);
        // 3 ,发送信息
        OutputStream outputStream = socket.getOutputStream();
        outputStream.write("你好".getBytes());
        outputStream.close();
        socket.close();

    }
}
