package cn.designPattern.prepare.supplement.thread.threadDemo;

/**
 * create by Freedom on 2021/2/1
 * <p>
 * �����߳�, ��12a, 34b, 56c ,78d.....֪��63 64z����
 */
public class ThreadDemo {
    public static void main(String[] args) {
        //����runnable֮���ͨ����Ҫ��һ���������, �������������Զ����class,Ҳ�����Ǹ�jdk�Դ���obj
        Foo o = new Foo();
        A a = new A(o);
        B b = new B(o);
        Thread t = new Thread(a);
        Thread t2 = new Thread(b);
        t.start();
        t2.start();
    }
}

