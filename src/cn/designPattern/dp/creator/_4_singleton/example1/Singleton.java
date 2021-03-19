package cn.designPattern.dp.creator._4_singleton.example1;

public class Singleton {
    private static final Singleton singleton = new Singleton();

    //���Ʋ����������
    private Singleton() {
    }

    //ͨ���÷������ʵ������
    public static Singleton getSingleton() {
        return singleton;
    }

    //��������������������static
    public static void doSomething() {
    }
}
