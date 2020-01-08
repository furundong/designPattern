package cn.designPattern.dp.creator._4_singleton.example2;

public class Client {
    public static void main(String[] args) throws CloneNotSupportedException {
//        Thread thread = new Thread((Runnable) new Client());//这里肯定是报错的，我就告诉你，多线程跑一跑
//        thread.start();

        //单线程情况。
        Singleton singleton = Singleton.getSingleton();
        Singleton clone = (Singleton) singleton.clone();
        System.out.println("singleton = " + singleton);
        System.out.println("clone = " + clone);
        System.out.println(clone == singleton);
    }
}
/*
单例模式是23个模式中比较简单的模式，应用也非常广泛，如在Spring中，每个Bean默
认就是单例的，这样做的优点是Spring容器可以管理这些Bean的生命期，决定什么时候创建
出来，什么时候销毁，销毁的时候要如何处理，等等。如果采用非单例模式（Prototype类
型），则Bean初始化后的管理交由J2EE容器，Spring容器不再跟踪管理Bean的生命周期。
 */