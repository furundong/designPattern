package cn.designPattern.dp.structure._1_proxy.example2;

import java.util.Date;

/*
强制代理:
   就是要从真实角色查找到代理角色，不允许直接访问真实角色。 什么意思呢？

   强制代理在设计模式中比较另类，为什么这么说呢？一般的思维都是通过代理找到真实
    的角色，但是强制代理却是要“强制”，你必须通过真实角色查找到代理角色，否则你不能访
    问。甭管你是通过代理类还是通过直接new一个主题角色类，都不能访问，

    只有通过真实角色指定的代理类才可以访问，也就是说由真实角色管理代理角色。
    这么说吧，高层模块new了一个真实角色的对象，返回的却是代理角色，

    这就好比是你和一个明星比较熟，相互认
    识，有件事情你需要向她确认一下，于是你就直接拨通了明星的电话：
    “喂，沙比呀，我要见一下×××导演，你帮下忙了！”
    “不行呀衰哥，我这几天很忙呀，你找我的经纪人吧……”
    郁闷了吧，你是想直接绕过她的代理，谁知道返回的还是她的代理，这就是强制代理，
    你可以不用知道代理存在，但是你的所作所为还是需要代理为你提供。

    就是说，真正的代理你得不到了，只有通过真正角色得到代理。
 */
public class Client {

    public static void main(String[] args) {
//定义一个游戏的角色
        IGamePlayer player = new GamePlayer("张三");
//然后再定义一个代练者
        IGamePlayer proxy = player.getProxy();
//开始打游戏，记下时间戳
        System.out.println("开始时间是："+new Date());
        proxy.login("zhangSan", "password");
//开始杀怪
        proxy.killBoss();
//升级
        proxy.upgrade();
//记录结束游戏时间
        System.out.println("结束时间是："+new Date());
    }

    /**
     * 还是不能访问，为什么呢？它不是真实角色指定的对象，这个代理对象是你自己new出
     * 来的，当然真实对象不认了，这就好比是那个明星，人家已经告诉你去找她的代理人了，你
     * 随便找个代理人能成吗？你必须去找她指定的代理才成！
     */
    public static void main02(String[] args) {
        //定义一个游戏的角色
        IGamePlayer player = new GamePlayer("张三");
//然后再定义一个代练者
        IGamePlayer proxy = new GamePlayerProxy(player);
//开始打游戏，记下时间戳
        System.out.println("开始时间是："+new Date());
        proxy.login("zhangSan", "password");
//开始杀怪
        proxy.killBoss();
//升级
        proxy.upgrade();
//记录结束游戏时间
        System.out.println("结束时间是："+new Date());
    }


    public static void main01(String[] args) {
//定义一个游戏的角色
        IGamePlayer player = new GamePlayer("张三");
//开始打游戏，记下时间戳
        System.out.println("开始时间是："+new Date());
        player.login("zhangSan", "password");
//开始杀怪
        player.killBoss();
//升级
        player.upgrade();
//记录结束游戏时间
        System.out.println("结束时间是："+new Date());
    }
}


/*
强制代理的概念就是要从真实角色查找到代理角色，不允
许直接访问真实角色。高层模块只要调用getProxy就可以访问真实角色的所有方法，它根本
就不需要产生一个代理出来，代理的管理已经由真实角色自己完成。

这从做法比较另类了，提提就好。
 */
