package cn.designPattern.dp.creator._4_singleton.example5;

public class Client {
    public static void main(String[] args) {
        Singleton instance = Singleton.INSTANCE;
        Singleton instance1 = Singleton.INSTANCE;
        System.out.println("instance = " + instance);
        System.out.println("instance1 = " + instance1);
        System.out.println(instance == instance1);
    }
}
/*
单例模式是23个模式中比较简单的模式，应用也非常广泛，如在Spring中，每个Bean默
认就是单例的，这样做的优点是Spring容器可以管理这些Bean的生命期，决定什么时候创建
出来，什么时候销毁，销毁的时候要如何处理，等等。如果采用非单例模式（Prototype类
型），则Bean初始化后的管理交由J2EE容器，Spring容器不再跟踪管理Bean的生命周期。
 */
