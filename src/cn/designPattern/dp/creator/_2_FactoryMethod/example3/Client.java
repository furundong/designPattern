package cn.designPattern.dp.creator._2_FactoryMethod.example3;

/**
 * 单例模式的核心要求就是在内存中
 * 只有一个对象，通过工厂方法模式也可以只在内存中生产一个对象
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
