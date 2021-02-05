package cn.designPattern.prepare.supplement.thread.threadDemo;

/**
 * create by Freedom on 2021/2/2
 */
class B implements Runnable {

    Foo o;

    public B(Foo o) {
        this.o = o;
    }

    @Override
    public void run() {
        synchronized (o) {
            for (int i = 'a'; i <= 'z'; i++) {
                while (o.i == 0) {
                    try {
                        o.notifyAll();
                        o.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println((char) i);
                o.i = 0;
                if((char)i=='z'){
                    o.notifyAll();
                    break;
                }
            }
        }
    }
}
