package cn.designPattern.dp.structure._1_proxy.example3;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class GamePlayIH implements InvocationHandler {

    //被代理者
    Class cls = null;
    //被代理的实例
    Object obj = null;

    //我要代理谁
    public GamePlayIH(Object _obj) {
        this.obj = _obj;
    }

    /**
     * @param proxy  代理类。
     * @param method 每个方法的对象,都拦截。
     * @param args   参数
     * @return
     * @throws Throwable
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        if (method.getName().equalsIgnoreCase("login")) {
            System.out.println("账号登录中。。。。");
        }
        if (method.getName().equalsIgnoreCase("killBoss")) {
            System.out.println("账号打怪中。。。。");
        }
        if (method.getName().equalsIgnoreCase("upgrade")) {
            System.out.println("账号升级啦。。。。");
        }
        Object invoke = method.invoke(this.obj, args);
        return invoke;
    }
}

/*
其中invoke方法是接口InvocationHandler定义必须实现的，它完成对真实方法的调用。我
们来详细讲解一下InvocationHandler接口，动态代理是根据被代理的接口生成所有的方法，
也就是说给定一个接口，动态代理会宣称“我已经实现该接口下的所有方法了”，那各位读者想想看，动态代理怎么才能实现被代理接口中的方法呢？
默认情况下所有的方法返回值都是空的，是的，代理已经实现它了，但是没有任何的逻辑含义，那怎么办？
好办，通过InvocationHandler接口，所有方法都由该Handler来进行处理，即所有被代理的方法都由InvocationHandler接管实际的处理任务


有人用我的账号就发送一个信息，然后看看自己的账号是不是被人盗了，非常
好的方法，这就是AOP编程。AOP编程没有使用什么新的技术，但是它对我们的设计、编码
有非常大的影响，对于日志、事务、权限等都可以在系统设计阶段不用考虑，而在设计后通
过AOP的方式切过去。 看看DynamicProxyModuel.png类图吧
 */
