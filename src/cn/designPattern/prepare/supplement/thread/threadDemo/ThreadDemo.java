package cn.designPattern.prepare.supplement.thread.threadDemo;

/**
 * create by Freedom on 2021/2/1
 * <p>
 * 两条线程, 打12a, 34b, 56c ,78d.....知道63 64z结束
 */
public class ThreadDemo {
    public static void main(String[] args) {
        //两个runnable之间的通信需要有一个共享对象, 这个对象可以是自定义的class,也可以是个jdk自带的obj
        Foo o = new Foo();
        A a = new A(o);
        B b = new B(o);
        Thread t = new Thread(a);
        Thread t2 = new Thread(b);
        t.start();
        t2.start();
    }
}

