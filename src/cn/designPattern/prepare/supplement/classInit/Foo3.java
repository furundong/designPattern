package cn.designPattern.prepare.supplement.classInit;

/**
 * create by Freedom on 2021/3/19
 */
public class Foo3 extends Father {
    int i = method();

    // ��̬ʱ��, ���õķ���ֻ��new �Ķ����й�.
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
