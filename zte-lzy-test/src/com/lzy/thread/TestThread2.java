package com.lzy.thread;

import java.io.File;
import java.net.URL;


public class TestThread2 implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            System.out.println("我在看代码---" + i);
        }
    }

    public static void main(String[] args) {
        TestThread2 testThread2 = new TestThread2();
        new Thread(testThread2).start();
        for (int i = 0; i < 500; i++) {
            System.out.println("我在学习多线程" + i);
        }
    }
}


