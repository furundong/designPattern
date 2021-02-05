package cn.designPattern.dp.structure._1_proxy.example4;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class DynamicProxy<T> {
    public static <T> T newProxyInstance(ClassLoader loader, Class<?>[] interfaces, InvocationHandler h){
//寻找JoinPoint连接点，AOP框架使用元数据定义
        if(true){  //这里可以写你的条件。。。。比如什么开头的接口名字。。
//执行一个前置通知
            (new BeforeAdvice()).exec();
        }
//执行目标，并返回结果
        return (T) Proxy.newProxyInstance(loader,interfaces, h);
    }
}
/*
在这里插入了较多的AOP术语，如在什么地方（连接点）执行什么行为（通知）。我们
在这里实现了一个简单的横切面编程，有经验的读者可以看看AOP的配置文件就会明白这段
代码的意义了。我们来看通知Advice，也就是我们要切入的类，


 */
