package cn.designPattern.dp.structure._7_proxy.example4;

import java.lang.reflect.InvocationHandler;

/*
动态代理实现代理的职责，业务逻辑Subject实现相关的
逻辑功能，两者之间没有必然的相互耦合的关系。通知Advice从另一个切面切入，最终在高
层模块也就是Client进行耦合，完成逻辑的封装任务。
 */
public class Clinet {
    public static void main(String[] args) {
        //定义一个主题
        Subject subject = new RealSubject();
//定义一个Handler
        InvocationHandler handler = new MyInvocationHandler(subject);
//定义主题的代理
        Subject proxy = DynamicProxy.newProxyInstance(
                subject.getClass().getClassLoader(),
                subject.getClass().getInterfaces(),  //这个getInterfaces()查找到该类的所有接口，所以，该类下面的所有类都被代理了。
                handler);
//代理的行为
        proxy.doSomething("Finish");
    }
}
/*
注意了: DynamicProxy.newProxyInstance() 这个代理是我们自己diy的，自己制作了一个前置通知。

这样与静态代理还有什么区别？
都是需要实现一个代理类，有区别，注意看父类，动态代理的主要意图就是解决我们常说的“审计”问
题，也就是横切面编程，在不改变我们已有代码结构的情况下增强或控制对象的行为。 即使是改变了，Subject接口规范，我们的代码，依然不会被撼动

注意　要实现动态代理的首要条件是：被代理类必须实现一个接口，回想一下前面的分
析吧。当然了，现在也有很多技术如CGLIB可以实现不需要接口也可以实现动态代理的方式。


 */