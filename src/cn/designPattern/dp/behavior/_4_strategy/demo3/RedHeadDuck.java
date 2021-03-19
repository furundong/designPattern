package cn.designPattern.dp.behavior._4_strategy.demo3;

/**
 * create by Freedom on 2021/2/9
 */
public class RedHeadDuck extends Duck {

    public RedHeadDuck(FlyBehavior flyBehavior, QuackBehavior quackBehavior) {
        super(flyBehavior, quackBehavior);
    }

    public void display() {
        System.out.println("外观是红头鸭子");
    }
}
