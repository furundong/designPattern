package cn.designPattern.prepare.supplement.classInit;

/**
 * create by Freedom on 2021/3/19
 */
public class Foo2 extends FatherFoo {

    private static int i = method();

    static {
        System.out.println(1);
    }

    private int ii = methos2();

    {
        System.out.println(3);
    }

    public Foo2() {
        super();
        System.out.println(5);
    }

    private static int method() {
        System.out.println(2);
        return 0;
    }

    //如果这个methos2方法不是私有的, 就是重写过后的. 再看看 Foo3
    public static void main(String[] args) {
        new Foo2();
    }


    //初始化子类, 先初始化父类

    private int methos2() {
        System.out.println(4);
        return 0;
    }
}

class FatherFoo {
    private static int i = method();

    static {
        System.out.println(11);
    }

    private int ii = methos2();

    {
        System.out.println(33);
    }

    public FatherFoo() {
        System.out.println(55);
    }

    private static int method() {
        System.out.println(22);
        return 0;
    }

    private int methos2() {
        System.out.println(44);
        return 0;
    }
}
