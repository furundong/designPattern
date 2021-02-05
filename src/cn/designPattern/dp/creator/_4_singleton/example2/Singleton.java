package cn.designPattern.dp.creator._4_singleton.example2;

public class Singleton implements Cloneable{
    private static Singleton singleton;
    private Singleton(){
    }
    public static Singleton getSingleton(){
        if (singleton == null){
            singleton = new Singleton();
        }
        return singleton;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

/*
该单例模式在低并发的情况下尚不会出现问题，若系统压力增大，并发量增加时则可能
在内存中出现多个实例，破坏了最初的预期。为什么会出现这种情况呢？如一个线程A执行
到singleton = new Singleton()，但还没有获得对象（对象初始化是需要时间的），第二个线程
B也在执行，执行到（singleton == null）判断，那么线程B获得判断条件也是为真，于是继续
运行下去，线程A获得了一个对象，线程B也获得了一个对象，在内存中就出现两个对象！

多线程的时候不安全.
这种写法应该是叫懒汉式... 其实叫啥都不重要, 只要看你怎么写, 且保证在并发的情况下没问题就行了.这个才是重中之重!!!!!!
知道概念而没有思路,其实还是为0

还有噢。不要实现Cloneable接口，会复制一个新的。 会被破坏。序列化也是。
 */
