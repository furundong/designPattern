package cn.designPattern.dp.behavior._4_strategy.demo1;

/**
 * create by Freedom on 2021/2/9
 */
public class RubberDuck extends Duck {
    @Override
    void display() {
        System.out.println("�������ƤѼ");
    }

    @Override
    void quack() {
        System.out.println("֨֨��");
    }

    @Override
    void fly() {
        System.out.println("���ܷ�");
    }
}
