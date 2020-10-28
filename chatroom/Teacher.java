package com.zou.chatroom;

import java.net.SocketException;

public class Teacher {
    public static void main(String[] args) throws SocketException {
        new Thread(new Talk(8888, 7777, "localhost")).start();
        new Thread(new TalkRecive(8888)).start();
    }
}
