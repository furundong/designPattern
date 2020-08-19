package cn.designPattern.dp.creator._2_FactoryMethod.example3;

/**
 * ����ģʽ�ĺ���Ҫ��������ڴ���
 * ֻ��һ������ͨ����������ģʽҲ����ֻ���ڴ�������һ������
 */
public class Client {
    public static void main(String[] args) {
        Singleton singleton = SingletonFactory.getSingleton();
        Singleton singleton1 = SingletonFactory.getSingleton();
        System.out.println("singleton = " + singleton);
        System.out.println("singleton1 = " + singleton1);
        System.out.println(singleton == singleton1);
    }
}
