package cn.designPattern.prepare.supplement.classInit;

/**
 * create by Freedom on 2021/3/19
 */
public class Foo {

    private static int i = method();

    static {
        System.out.println(1);
    }

    private int ii = methos2();

    {
        System.out.println(3);
    }

    public Foo() {
        System.out.println(5);
    }

    private static int method() {
        System.out.println(2);
        return 0;
    }

    // 如果有父类, 那么一定会调用父类. 请看FOO2
    public static void main(String[] args) {
        new Foo();
    }

    //调用main方法, 初始化当前类 , 类的调用引起初始化,
    //1. 静态代码块 静态变量 静态赋值语句  (顺序执行)


    //当你new出该类对象实例. 初始化实例
    //1. 构造代码块 成员变量, 成员赋值语句 (顺序执行)
    //2. 构造器是最后执行的.

    private int methos2() {
        System.out.println(4);
        return 0;
    }
}
