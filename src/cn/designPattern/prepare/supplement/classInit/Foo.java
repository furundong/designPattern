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

    // ����и���, ��ôһ������ø���. �뿴FOO2
    public static void main(String[] args) {
        new Foo();
    }

    //����main����, ��ʼ����ǰ�� , ��ĵ��������ʼ��,
    //1. ��̬����� ��̬���� ��̬��ֵ���  (˳��ִ��)


    //����new���������ʵ��. ��ʼ��ʵ��
    //1. �������� ��Ա����, ��Ա��ֵ��� (˳��ִ��)
    //2. �����������ִ�е�.

    private int methos2() {
        System.out.println(4);
        return 0;
    }
}
