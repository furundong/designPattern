package cn.designPattern.dp.behavior._4_strategy.demo2;

/**
 * create by Freedom on 2021/2/9
 * <p>
 * 我们可以在鸭子的飞行以及叫法过程中, 将超类中提取出来, 放到一个独立的接口,flyable,quackable 这样, 鸭子如果有这个功能,就是实现这个接口
 * <p>
 * 有人会说了. 那现在不是没什么问题了吗. 我jdk1.8以后, 接口里面的方法, 是可以有默认的方法体的,那么我就不需要再实现类中
 * 将方法重写一遍, 提高了重用性
 * <p>
 * 问题是: 现在我们看鸭子的quack方法, 鸭子默认是呱呱叫, 橡皮鸭是吱吱,如果后面还有更多的叫法呢??? 几十种叫法, 默认实现只有一种, 代码还是在重复呀.
 * 虽然放到一个独立的接口,flyable,quackable可以解决一部分的问题,但是现在是从一个噩梦跳到了另一个噩梦.
 * <p>
 * ok,现在让我们来看看策略模式, 该登场了.
 */
public class Client {
    public static void main(String[] args) {
        MallardDuck mallardDuck = new MallardDuck();
        RedHeadDuck redHeadDuck = new RedHeadDuck();
        RubberDuck rubberDuck = new RubberDuck();
        mallardDuck.display();
        mallardDuck.fly();
        mallardDuck.quack();
        mallardDuck.swim();
        System.out.println("-----------------------------");
        redHeadDuck.display();
        redHeadDuck.quack();
        redHeadDuck.fly();
        redHeadDuck.swim();
        System.out.println("-----------------------------");
        rubberDuck.display();
        rubberDuck.swim();
        rubberDuck.quack();
    }
}
