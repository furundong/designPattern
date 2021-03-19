package cn.designPattern.prepare.supplement.thread.threadDemo2;

/**
 * create by Freedom on 2021/2/2
 * 1a , 2b , 3c .....26z, 字母应该是26个把. 哈哈哈. 我忘记了
 */
public class ThreadDemo2 {
    public static void main(String[] args) {
        //建议定义好线程,因为如果写下面, 上面{...}的代码出现了死循环, 代码永远都运行不了
        A a = new A();
        Thread t = new Thread(a);
        t.start();

        synchronized (a) {
            for (int i = 1; i <= 26; i++) {
                System.out.print(i + " ");
                if (i == 26) {
                    a.notifyAll();
                    break;
                }
                try {
                    a.notifyAll(); //唤醒等待队列,
                    a.wait();   //自己进入阻塞状态, 释放cpu, 释放锁 , 下次被唤醒会从这个地方运行
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}

