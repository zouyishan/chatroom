package com.zou.chatroom;

import java.net.SocketException;

public class Student {
    public static void main(String[] args) throws SocketException {
        new Thread(new Talk(7777, 8888, "localhost")).start();
        new Thread(new TalkRecive(7777)).start();
    }
}
