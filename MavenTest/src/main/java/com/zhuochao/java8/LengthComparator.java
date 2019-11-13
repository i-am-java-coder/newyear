package com.zhuochao.java8;

import java.util.Comparator;

/*
* lamda表达式，作用域和引用他的方法的其他变量一样。 lamda表达式中使用this，引用的是所在方法的this。此两者和内部类不同。
* */
public class LengthComparator implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        return 0;
    }

    public void main() {
        String o1 = "";
        Comparator<String> comp = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                System.out.println(this.toString());
                return Integer.compare(o1.length(),o2.length());
            }
        };

        /*Comparator<String> comp = (first,second) -> {
            System.out.println(this.toString());
            return Integer.compare(first.length(),second.length());
        };*/
        int compare = comp.compare("HELLO", "WORLD");
        System.out.println(compare);
    }

    public static void main(String[] args) {
        LengthComparator lengthComparator = new LengthComparator();
        lengthComparator.main();
    }

    @Override
    public String toString() {
        return "HEHE";
    }
}
