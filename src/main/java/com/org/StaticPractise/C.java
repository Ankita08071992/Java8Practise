package com.org.StaticPractise;

public class C {
    static void method1() {
        System.out.println("C.method1");
        method2();
    }

    static void method2() {
        System.out.println("C.method2");
        method3();
    }

    static void method3() {
        System.out.println("C.method3");
    }
}
