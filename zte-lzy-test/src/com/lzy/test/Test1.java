package com.lzy.test;

import java.lang.reflect.Method;

public class Test1 extends Abstract_test1 {
    public Test1() {
        System.out.println("子类构造方法执行");
    }
    public void method1(){
        System.out.println("这是抽象方法1");
    }
}
