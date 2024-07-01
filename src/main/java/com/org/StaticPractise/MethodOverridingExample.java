package com.org.StaticPractise;

public class MethodOverridingExample {
    public static void main(String[] args) {
        A a = new B();
        a.method1();
        /*output: B.method1
        A.method2
        B.method3*/

        System.out.println("================");

        C c = new D();
        c.method1();
        /*output:C.method1
        C.method2
        C.method3*/

        System.out.println("================");

        F f = new A();
        f.method1();

        System.out.println("================");

        F f1 = new B();
        f1.method1();
    }
}
