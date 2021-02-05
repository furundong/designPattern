package cn.designPattern.dp.creator._4_singleton.example5;

/*
静态内部类
 */
public enum  Singleton {
    INSTANCE;

    Singleton(){}
}
/*
应该是最简单的方法吧，枚举构造函数为私有，不能再创建枚举对象，枚举对象的声明和初始化都是在static块中，由JVM的ClassLoader机制保证了线程的安全性。
Singleton4.INSTANCE就是类Singleton4的唯一实例。
 */
