package com.zhuochao.thinkinjava;

public class ClassLoadCase {
    public static Caps name = new Caps("Caps调用前被初始化了");
    public static String age;
    private Caps caps = new Caps("小菠萝","5");
    static{
        age = "27";
        System.out.println("age调用前被初始化了");
    }
    public static void main(String[] args) {

    }
}

class Caps{
    Caps(String name){
        System.out.println(name);
    }
    Caps(String name,String age){
        System.out.println("name:"+name);
        System.out.println("age:"+age);
    }

    public Caps() {

    }
}
