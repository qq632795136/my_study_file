package com.lzy.test;

/*
抽象方法所在的类必须是抽象类
而且不能直接new抽象类对象，只能通过子类继承并覆盖重写所有抽象方法
创建子类并使用
**/
public abstract class Abstract_test1 {
    public Abstract_test1(){
        System.out.println("抽象父类构造方法执行");
    }
    public abstract void method1();
    public void method2(){};   //普通方法
}
