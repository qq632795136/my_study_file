package com.lzy.thread;

import sun.security.krb5.internal.Ticket;

public class testthread3 implements Runnable {
    private int ticketNums = 10;
    @Override
    public void run() {
        while(true) {
            if (ticketNums <= 0) {
                break;
            }
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName()+"拿到了第" + ticketNums-- + "张票");
        }
    }

    public static void main(String[] args) {
        testthread3 testthread3 =new testthread3();
        new Thread(testthread3,"小明").start();
        new Thread(testthread3,"小李").start();
        new Thread(testthread3,"小张").start();

    }
}
