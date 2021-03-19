package cn.designPattern.dp.behavior._4_strategy.demo2;


/**
 * create by Freedom on 2021/2/9
 */
public class RubberDuck extends Duck implements Quackable {
    @Override
    void display() {
        System.out.println("�������ƤѼ");
    }

    @Override
    public void quack() {
        System.out.println("֨֨��");
    }
}
