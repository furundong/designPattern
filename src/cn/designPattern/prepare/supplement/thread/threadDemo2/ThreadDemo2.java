package cn.designPattern.prepare.supplement.thread.threadDemo2;

/**
 * create by Freedom on 2021/2/2
 * 1a , 2b , 3c .....26z, ��ĸӦ����26����. ������. ��������
 */
public class ThreadDemo2 {
    public static void main(String[] args) {
        //���鶨����߳�,��Ϊ���д����, ����{...}�Ĵ����������ѭ��, ������Զ�����в���
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
                    a.notifyAll(); //���ѵȴ�����,
                    a.wait();   //�Լ���������״̬, �ͷ�cpu, �ͷ��� , �´α����ѻ������ط�����
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}

