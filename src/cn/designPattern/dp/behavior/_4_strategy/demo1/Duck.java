package cn.designPattern.dp.behavior._4_strategy.demo1;

/**
 * create by Freedom on 2021/2/9
 */
public abstract class Duck {
    void quack() {
        System.out.println("���ɽ�");
    }

    void swim() {
        System.out.println("Ѽ�ӻ���Ӿ");
    }

    //������ӵķ���
    void fly() {
        System.out.println("Ѽ���ܷ���");
    }

    abstract void display();
}
