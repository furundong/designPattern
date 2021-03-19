package cn.designPattern.prepare.supplement.thread.threadDemo2;

/**
 * create by Freedom on 2021/2/3
 */
class A implements Runnable {

    @Override
    public void run() {
        synchronized (this) {
            for (int i = 'a'; i <= 'z'; i++) {
                //我记得a是65,但是我懒得查了
                System.out.println((char) i);
                if ((char) i == 'z') {
                    this.notifyAll();
                    break;
                }
                try {
                    this.notifyAll();
                    this.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
