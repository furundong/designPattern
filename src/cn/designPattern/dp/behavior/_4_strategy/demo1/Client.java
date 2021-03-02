package cn.designPattern.dp.behavior._4_strategy.demo1;

/**
 * create by Freedom on 2021/2/9
 *
 * 本例子出自 Header First里面的策略模式, 讲得非常的好
 */
public class Client {
    public static void main(String[] args) {
        Duck mallardDuck = new MallardDuck();
        Duck redHeadDuck = new RedHeadDuck();
        Duck rubberDuck = new RubberDuck();
        mallardDuck.display();
        mallardDuck.quack();
        mallardDuck.swim();
        System.out.println("-----------------------------");
        redHeadDuck.display();
        redHeadDuck.quack();
        redHeadDuck.swim();
        System.out.println("-----------------------------");
        rubberDuck.display();
        rubberDuck.swim();
        rubberDuck.quack();
        rubberDuck.fly();
    }
}

/*
现在变化来了, 有些鸭子能飞.  我们在duck上面加上能飞的办法.

现在所有的具体鸭子都继承自duck, 那么所有的鸭子都能飞了,但是问题发生了.

现在具体的鸭子里面有一个橡皮鸭, 橡皮鸭能飞吗, 不能!!!

解决方法: 我们将橡皮鸭里面的方法, 重写不就好了.另外quack也是一样的道理
问题是, 如果我们有40个鸭子, 有20个不会叫, 有10个不会飞, 那么现在应该怎么办啊. 而且都要自己判断, 代码也是一直在重复

那我们现在来看其他解决办法
 */
