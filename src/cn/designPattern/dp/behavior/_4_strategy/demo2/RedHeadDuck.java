package cn.designPattern.dp.behavior._4_strategy.demo2;

/**
 * create by Freedom on 2021/2/9
 */
public class RedHeadDuck extends Duck implements Flyable,Quackable{
    @Override
    void display() {
        System.out.println("外观是红头鸭子");
    }
}
