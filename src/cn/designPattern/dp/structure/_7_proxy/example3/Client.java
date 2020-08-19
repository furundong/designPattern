package cn.designPattern.dp.structure._7_proxy.example3;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/*
    动态代理： 重点中的重点。
    动态代理是在实现阶段不用关心代理谁，而在运行阶段才指定代理哪一个对象。相对来说，自己写代理类的方式就是静态代理。
    现在有一个非常流行的名称叫做面向横切面编程，也就是AOP（Aspect Oriented Programming），其核心就是采用了动态代理机制，

    在类图中增加了一个InvocationHandler接口和GamePlayIH类，作用就是产生一个对象的
    代理对象，其中InvocationHandler是JDK提供的动态代理接口，对被代理类的方法进行代理。
    我们来看程序，接口保持不变，实现类也没有变化，
 */
public class Client {
    public static void main(String[] args) {
//定义一个痴迷的玩家
        IGamePlayer player = new GamePlayer("张三");
//定义一个handler
        InvocationHandler handler = new GamePlayIH(player);  //真正代理的是  player，张三
//开始打游戏，记下时间戳
        System.out.println("开始时间是：2009-8-25 10:45");
//获得类的class loader
        ClassLoader cl = player.getClass().getClassLoader();
        //动态产生一个代理者
        //创建代理对象
        //第1个参数:Classloader
        // 我们都知道,要实例化一个对象,是需要调用类的构造器的,在程序运行期间第一次调用构造器时,就会引起类的加载
        // 加载类的时候,就是jνm拿着 Classloader去加载类的字节码的,只有字节码被加载到了内存中,才能进一步去实例化岀类的对象
        // 简单来说,就是只要涉及实例化类的对象,就一定要加载类的字节码,而加载字节码就必须使用类加载器
        // 下面我们使用的是动态代理的api来创建一个类的对象,这是一种不常用的实例化类对象的方式,尽管不常用,但毕竟涉及实例化类的对象
        // 那就一定也需要加载类的字节码,也就一定需要类加载器,所以我们手动把类加载器传入

        //第2个参数：Class[]
        //我们已经知道,下面的代码,是用来实例化一个对家象的,实例化对象,就一定是实例化某一个类的对象。
        // 问题是,到底是哪个类呢?类在哪里?字节码又在哪里?
        // 这个类,其实并不在硬盘上,而是在内存中!是由动态代理在内存中“动态”生成的!(见本包的图)
        // 要知道,这个在内存中直接生成的字节码,会去实现下面方法中的第2个参数中,所指定的接口

        //第3个参数： InvocationHandler
//        注意：每次对代理对象任何方法调用，都不会进入真正的方法中。而是进入第三个参数的invoke方法
        IGamePlayer proxy = (IGamePlayer) Proxy.newProxyInstance(cl,new Class[]{IGamePlayer.class},handler);

//登录
        proxy.login("zhangSan", "password");
//开始杀怪
        proxy.killBoss();
//升级
        proxy.upgrade();
//记录结束游戏时间
        System.out.println("结束时间是：2009-8-26 03:40");
    }
}

/*
这个时候就要说了。登录我需要日志。实现一下吧。  有了代理就会发现是真的轻松。

代理功能不仅如此：看看example4，更加解耦

 */