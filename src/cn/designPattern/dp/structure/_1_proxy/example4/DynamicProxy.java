package cn.designPattern.dp.structure._1_proxy.example4;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class DynamicProxy<T> {
    public static <T> T newProxyInstance(ClassLoader loader, Class<?>[] interfaces, InvocationHandler h){
//Ѱ��JoinPoint���ӵ㣬AOP���ʹ��Ԫ���ݶ���
        if(true){  //�������д�������������������ʲô��ͷ�Ľӿ����֡���
//ִ��һ��ǰ��֪ͨ
            (new BeforeAdvice()).exec();
        }
//ִ��Ŀ�꣬�����ؽ��
        return (T) Proxy.newProxyInstance(loader,interfaces, h);
    }
}
/*
����������˽϶��AOP�������ʲô�ط������ӵ㣩ִ��ʲô��Ϊ��֪ͨ��������
������ʵ����һ���򵥵ĺ������̣��о���Ķ��߿��Կ���AOP�������ļ��ͻ��������
����������ˡ���������֪ͨAdvice��Ҳ��������Ҫ������࣬


 */
