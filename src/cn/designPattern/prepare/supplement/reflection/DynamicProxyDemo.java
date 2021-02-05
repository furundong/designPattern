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

        //在运行期动态创建一个interface实例的方法如下：
        //
        //定义一个InvocationHandler实例，它负责实现接口的方法调用；
        //通过Proxy.newProxyInstance()创建interface实例，它需要3个参数：
            //使用的ClassLoader，通常就是接口类的ClassLoader；
            //需要实现的接口数组，至少需要传入一个接口进去；
            //用来处理接口方法调用的InvocationHandler实例。
            //将返回的Object强制转型为接口。
        Hello hello = (Hello) Proxy.newProxyInstance(
                Hello.class.getClassLoader(), // 传入ClassLoader
                new Class[] { Hello.class }, // 传入要实现的接口
                handler); // 传入处理调用方法的InvocationHandler
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
在jvm中大概的代码为如上
 */
