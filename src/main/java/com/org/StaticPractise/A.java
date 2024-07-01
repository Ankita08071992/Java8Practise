package com.org.StaticPractise;

public class A implements F {
    @Override
    public void method1() {
        System.out.println("A.method1");
        method2();
    }

    public void method2() {
        System.out.println("A.method2");
        method3();
    }

    public void method3() {
        System.out.println("A.method3");
    }
}
