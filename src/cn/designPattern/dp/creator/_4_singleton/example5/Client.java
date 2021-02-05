package cn.designPattern.dp.creator._4_singleton.example5;

public class Client {
    public static void main(String[] args) {
        Singleton instance = Singleton.INSTANCE;
        Singleton instance1 = Singleton.INSTANCE;
        System.out.println("instance = " + instance);
        System.out.println("instance1 = " + instance1);
        System.out.println(instance == instance1);
    }
}
/*
����ģʽ��23��ģʽ�бȽϼ򵥵�ģʽ��Ӧ��Ҳ�ǳ��㷺������Spring�У�ÿ��BeanĬ
�Ͼ��ǵ����ģ����������ŵ���Spring�������Թ�����ЩBean�������ڣ�����ʲôʱ�򴴽�
������ʲôʱ�����٣����ٵ�ʱ��Ҫ��δ����ȵȡ�������÷ǵ���ģʽ��Prototype��
�ͣ�����Bean��ʼ����Ĺ�����J2EE������Spring�������ٸ��ٹ���Bean���������ڡ�
 */
