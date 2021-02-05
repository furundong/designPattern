package cn.designPattern.prepare.supplement.reflection;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * create by Freedom on 2021/2/1
 */
public class DynamicProxyDemo {
    public static void main(String[] args) {
        InvocationHandler handler = new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                System.out.println(method);
                if (method.getName().equals("morning")) {
                    System.out.println("Good morning, " + args[0]);
                }
                return null;
            }
        };

        //�������ڶ�̬����һ��interfaceʵ���ķ������£�
        //
        //����һ��InvocationHandlerʵ����������ʵ�ֽӿڵķ������ã�
        //ͨ��Proxy.newProxyInstance()����interfaceʵ��������Ҫ3��������
            //ʹ�õ�ClassLoader��ͨ�����ǽӿ����ClassLoader��
            //��Ҫʵ�ֵĽӿ����飬������Ҫ����һ���ӿڽ�ȥ��
            //��������ӿڷ������õ�InvocationHandlerʵ����
            //�����ص�Objectǿ��ת��Ϊ�ӿڡ�
        Hello hello = (Hello) Proxy.newProxyInstance(
                Hello.class.getClassLoader(), // ����ClassLoader
                new Class[] { Hello.class }, // ����Ҫʵ�ֵĽӿ�
                handler); // ���봦����÷�����InvocationHandler
        hello.morning("Bob");
    }
}

interface Hello {
    void morning(String name);
}

/*
public class HelloDynamicProxy implements Hello {
    InvocationHandler handler;
    public HelloDynamicProxy(InvocationHandler handler) {
        this.handler = handler;
    }
    public void morning(String name) {
        handler.invoke(
           this,
           Hello.class.getMethod("morning", String.class),
           new Object[] { name });
    }
}
��jvm�д�ŵĴ���Ϊ����
 */
