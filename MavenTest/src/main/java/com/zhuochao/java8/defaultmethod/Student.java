package com.zhuochao.java8.defaultmethod;


/*一个类实现了两个同名同参数的接口的default方法后，通过类名+super+方法来调用。
  类优先的原则：一个类继承的另一个类和和接口如果包含相同名称,相同参数的方法，取类中的方法。
 */
public class Student extends Teacher implements Person, Named {

   /* @Override
    public String getName() {
        return Named.super.getName();
    }*/

    @Override
    public long getId() {
        return 0;
    }

    public static void main(String[] args) {
        Student student = new Student();
        String name = student.getName();
        System.out.println(name);
    }
}
