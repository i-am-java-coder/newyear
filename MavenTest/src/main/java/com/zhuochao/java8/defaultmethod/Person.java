package com.zhuochao.java8.defaultmethod;

public interface Person {
    long getId();
    default String getName() {
        return "HELLO WORLD";
    }
}
