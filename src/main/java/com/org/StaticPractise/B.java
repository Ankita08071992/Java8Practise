package com.org.StaticPractise;

public class B extends A {
    @Override
    public void method1() {
        System.out.println("B.method1");
        method2();
    }

    public void method3() {
        System.out.println("B.method3");
    }
}