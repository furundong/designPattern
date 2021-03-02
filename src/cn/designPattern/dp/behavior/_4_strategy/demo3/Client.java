package cn.designPattern.dp.behavior._4_strategy.demo3;

/**
 * create by Freedom on 2021/2/9
 * 现在所有的鸭子跟他的行为已经没有关系了. 我们采用组合的方法,将问题解决
 * <p>
 * 当然在具体的鸭子里面, 你可以直接将能不能飞, 怎么叫写好, 可以不暴露在客户端.
 * 这个其实就是看你的业务逻辑了.
 */
public class Client {
    public static void main(String[] args) {
        Duck mallardDuck = new MallardDuck(new FlyWithWings(), new Quack());
        Duck redHeadDuck = new RedHeadDuck(new FlyWithWings(), new Quack());
        Duck rubberDuck = new RubberDuck(new FlyNoWay(), new Squeak());
        mallardDuck.display();
        mallardDuck.fly();
        mallardDuck.quack();
        System.out.println("-----------------------------");
        redHeadDuck.display();
        redHeadDuck.quack();
        redHeadDuck.fly();
        System.out.println("-----------------------------");
        rubberDuck.display();
        rubberDuck.quack();
        rubberDuck.fly();

    }
}
