package com.zou.chatroom;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.*;

public class Talk implements Runnable {

    private int MyPort;
    private int Port;
    private String Ip;
    private DatagramSocket datagramSocket = null;
    BufferedReader scanner = new BufferedReader(new InputStreamReader(System.in));

    public Talk(int MyPort, int Port, String Ip) throws SocketException {
        this.MyPort = MyPort;
        this.Ip = Ip;
        this.datagramSocket = new DatagramSocket();
        this.Port = Port;
    }

    @Override
    public void run() {
        while (true) {
            try {
                String s = scanner.readLine();
                byte[] bytes = s.getBytes();
                DatagramPacket datagramPacket = new DatagramPacket(bytes, 0, bytes.length, new InetSocketAddress(Ip, Port));
                datagramSocket.send(datagramPacket);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
