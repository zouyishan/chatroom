package com.zou.chatroom;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class TalkRecive implements Runnable {
    DatagramSocket datagramSocket = null;
    private int Port;
    public TalkRecive(int Port) throws SocketException {
        this.Port = Port;
        this.datagramSocket = new DatagramSocket(this.Port);
    }

    @Override
    public void run() {
        while (true) {
            try {
                byte[] bytes = new byte[1024];
                DatagramPacket datagramPacket = new DatagramPacket(bytes, 0, bytes.length);
                datagramSocket.receive(datagramPacket);
                System.out.println(new String(datagramPacket.getData(), 0, datagramPacket.getLength()));
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
