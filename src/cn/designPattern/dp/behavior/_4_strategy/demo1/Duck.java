package cn.designPattern.dp.behavior._4_strategy.demo1;

/**
 * create by Freedom on 2021/2/9
 */
public abstract class Duck {
    void quack() {
        System.out.println("呱呱叫");
    }

    void swim() {
        System.out.println("鸭子会游泳");
    }

    //后面添加的方法
    void fly() {
        System.out.println("鸭子能飞了");
    }

    abstract void display();
}
