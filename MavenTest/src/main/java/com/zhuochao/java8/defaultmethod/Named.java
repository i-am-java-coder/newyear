package com.zhuochao.java8.defaultmethod;

public interface Named {
    default String getName() {
        return getClass().getName()+"_"+hashCode();
    }
}
