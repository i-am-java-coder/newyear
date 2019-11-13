package com.zhuochao.java8;

/*
 * 不可改变count的值，因为线程不安全。 若多个线程操作这个变量，因为非原子操作,所以不OK。
 */
public class Closure {
    public static void repeatMessage(String text,int count) {
        Runnable r = () -> {
            for (int i = 0; i < count; i++) {
                System.out.println(text);
                Thread.yield();
            }
        };
        new Thread(r).start();
    }

    public static void main(String[] args) {
        repeatMessage("TEXT",10);
    }
}
