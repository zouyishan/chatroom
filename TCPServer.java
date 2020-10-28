package com.zou;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServer {
    public static void main(String[] args) throws IOException {
        // 1, 要有一个地址
        ServerSocket serverSocket = new ServerSocket(9999);
        // 2, 等待客户端连接过来
        Socket socket = serverSocket.accept();
        InputStream inputStream = socket.getInputStream();
        byte[] bytes = new byte[1024];
        int len;
        while ((len = inputStream.read(bytes)) != -1) {
            String s = new String(bytes, 0, len);
            System.out.println(s);
        }
        inputStream.close();
        socket.close();
        serverSocket.close();
    }
}
