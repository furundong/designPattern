package cn.designPattern.dp.creator._4_singleton.example4;

/*
��̬�ڲ���
 */
public class Singleton {
    private Singleton() {
    }

    public static Singleton getInstance() {
        return Temp.singleton;
    }

    private static class Temp {
        private static Singleton singleton = new Singleton();
    }
}
/*
JVM��֤������صĹ�����static������ڶ��̻߳��ߵ��߳��¶���ȷִ�У��ҽ�ִ��һ�Ρ�
�ڲ��಻��������ⲿ��ʹ�ã�ֻ���ڵ���getInstance()����ʱ�Żᱻ���أ�������ӳ�
�����Լ��̰߳�ȫ�����⡣
 */
