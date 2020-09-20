package com.lzy.test;

public interface Interface_demo1 {
    // 这是一个抽象方法
    public abstract void method1();
    public default void method2(){
        System.out.println("123");
    };
    public static void method3(){
        System.out.println("这是一个静态接口方法");
    };
}
