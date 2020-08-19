package cn.designPattern.dp.structure._7_proxy.example4;

import java.lang.reflect.InvocationHandler;

/*
��̬����ʵ�ִ����ְ��ҵ���߼�Subjectʵ����ص�
�߼����ܣ�����֮��û�б�Ȼ���໥��ϵĹ�ϵ��֪ͨAdvice����һ���������룬�����ڸ�
��ģ��Ҳ����Client������ϣ�����߼��ķ�װ����
 */
public class Clinet {
    public static void main(String[] args) {
        //����һ������
        Subject subject = new RealSubject();
//����һ��Handler
        InvocationHandler handler = new MyInvocationHandler(subject);
//��������Ĵ���
        Subject proxy = DynamicProxy.newProxyInstance(
                subject.getClass().getClassLoader(),
                subject.getClass().getInterfaces(),  //���getInterfaces()���ҵ���������нӿڣ����ԣ���������������඼�������ˡ�
                handler);
//�������Ϊ
        proxy.doSomething("Finish");
    }
}
/*
ע����: DynamicProxy.newProxyInstance() ��������������Լ�diy�ģ��Լ�������һ��ǰ��֪ͨ��

�����뾲̬������ʲô����
������Ҫʵ��һ�������࣬������ע�⿴���࣬��̬�������Ҫ��ͼ���ǽ�����ǳ�˵�ġ���ơ���
�⣬Ҳ���Ǻ������̣��ڲ��ı��������д���ṹ���������ǿ����ƶ������Ϊ�� ��ʹ�Ǹı��ˣ�Subject�ӿڹ淶�����ǵĴ��룬��Ȼ���ᱻ����

ע�⡡Ҫʵ�ֶ�̬�������Ҫ�����ǣ������������ʵ��һ���ӿڣ�����һ��ǰ��ķ�
���ɡ���Ȼ�ˣ�����Ҳ�кܶ༼����CGLIB����ʵ�ֲ���Ҫ�ӿ�Ҳ����ʵ�ֶ�̬����ķ�ʽ��


 */