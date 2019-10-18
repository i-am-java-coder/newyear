package com.zhuochao.thinkinjava;

/*
    需要注意的是：没有static的代码块，每次创建实例就会初始化
 */
public class NoStaticVariableInitialization {
    private String time;
    private String address;
    {
        time = String.valueOf(System.currentTimeMillis());
        address = "中国陕西省西安雁塔区";
        System.out.println("非静态初始化完成了");
    }

    public NoStaticVariableInitialization(){
        System.out.println(time);
        System.out.println(address);
    }

    public static void main(String[] args) {
        NoStaticVariableInitialization noStaticVariableInitialization = new NoStaticVariableInitialization();
        NoStaticVariableInitialization noStaticVariableInitialization1 = new NoStaticVariableInitialization();
    }
}
