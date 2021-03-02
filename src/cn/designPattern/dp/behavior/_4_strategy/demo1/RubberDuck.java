package cn.designPattern.dp.behavior._4_strategy.demo1;

/**
 * create by Freedom on 2021/2/9
 */
public class RubberDuck extends Duck {
    @Override
    void display() {
        System.out.println("外观是橡皮鸭");
    }

    @Override
    void quack() {
        System.out.println("吱吱叫");
    }

    @Override
    void fly() {
        System.out.println("不能飞");
    }
}
