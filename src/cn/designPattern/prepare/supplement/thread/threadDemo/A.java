package cn.designPattern.prepare.supplement.thread.threadDemo;

/**
 * create by Freedom on 2021/2/2
 */
class A implements Runnable {

    Foo o;

    public A(Foo o) {
        this.o = o;
    }

    @Override
    public void run() {
        synchronized (o) {
            for (int i = 1; i <= 53; i++) {
                while (o.i == 1) {
                    if ((i & 1) == 1) { //�п�������Ῠ��
                        try {
                            o.notifyAll();
                            o.wait(); //���ỽ����Ϊwait���������߳�
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
                if (i == 53) {
                    break;
                }
                System.out.print(i + " ");
                if ((i & 1) == 0) {
                    o.i = 1;
                }
            }
        }
    }
}
