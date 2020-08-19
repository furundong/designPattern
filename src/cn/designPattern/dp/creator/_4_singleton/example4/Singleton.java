package cn.designPattern.dp.creator._4_singleton.example4;

import sun.swing.plaf.synth.DefaultSynthStyle;

/*
��̬�ڲ���
 */
public class Singleton {
    private Singleton(){}
    private static class Temp{
      private static Singleton singleton = new Singleton();
    }

    public static  Singleton getInstance(){
        return Temp.singleton;
    }
}
/*
JVM��֤������صĹ�����static������ڶ��̻߳��ߵ��߳��¶���ȷִ�У��ҽ�ִ��һ�Ρ�
�ڲ��಻��������ⲿ��ʹ�ã�ֻ���ڵ���getInstance()����ʱ�Żᱻ���أ�������ӳ�
�����Լ��̰߳�ȫ�����⡣
 */