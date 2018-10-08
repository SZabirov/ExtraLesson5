package com.company;

public class A {
    int x;
    A(int x) {
        System.out.println("Constructor with x");
        this.x = x;
    }
    A() {
        System.out.println("A");
        x = 42;
    }
}
