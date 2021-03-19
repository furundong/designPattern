package cn.designPattern.prepare.supplement.classInit;

/**
 * create by Freedom on 2021/3/19
 */
public class Foo3 extends Father {
    int i = method();

    // 多态时候, 调用的方法只能new 的对象有关.
    public static void main(String[] args) {
        new Foo3();
    }

    int method() {
        System.out.println(1);
        return 0;
    }
}

class Father {
    int i = method();

    int method() {
        System.out.println(2);
        return 0;
    }
}
