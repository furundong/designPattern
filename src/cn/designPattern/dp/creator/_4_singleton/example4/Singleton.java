package cn.designPattern.dp.creator._4_singleton.example4;

import sun.swing.plaf.synth.DefaultSynthStyle;

/*
静态内部类
 */
public class Singleton {
    private Singleton(){}
    private static class Temp{
      private static Singleton singleton = new Singleton();
    }

    public static  Singleton getInstance(){
        return Temp.singleton;
    }
}
/*
JVM保证在类加载的过程中static代码块在多线程或者单线程下都正确执行，且仅执行一次。
内部类不会在类的外部被使用，只有在调用getInstance()方法时才会被加载，解决了延迟
加载以及线程安全的问题。
 */