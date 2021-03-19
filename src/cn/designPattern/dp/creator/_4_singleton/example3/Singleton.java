package cn.designPattern.dp.creator._4_singleton.example3;

/*
采用了双重检查，线程安全(推荐)
 */
public class Singleton {
    private volatile static Singleton singleton;

    private Singleton() {
    }

    public static Singleton getInstance() {
        if (singleton == null) {
            synchronized (Singleton.class) {
                if (singleton == null) {
                    singleton = new Singleton();
                }
            }
        }
        return singleton;
    }
}

/*
为什么要判断两次null呢？

线程1，跟2 同时进入第一个null， 第一个线程进入并创建完推出后，第二个直接又创建了。 出现bug。

为什么要用volatile
instance = new Singleton2()可以分解为三部分
1 memory=allocate();// 分配内存
2 ctorInstance(memory) //初始化对象
3 instance=memory //设置instance指向刚分配的地址

JVM出于优化需要可能进行指令重排就会出现1->3->2的情况，多线程的情况下instance还没有初始化之前其他线程就会在外部检查到instance不为null，而返回还没有初始化的instance，就会有问题

JVM不会将volatile变量上的操作与其他内存操作一起重新排序，保证检测instance的状态时都是最新的
 */
