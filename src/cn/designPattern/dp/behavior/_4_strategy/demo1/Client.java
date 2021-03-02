package cn.designPattern.dp.behavior._4_strategy.demo1;

/**
 * create by Freedom on 2021/2/9
 *
 * �����ӳ��� Header First����Ĳ���ģʽ, ���÷ǳ��ĺ�
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
���ڱ仯����, ��ЩѼ���ܷ�.  ������duck��������ܷɵİ취.

�������еľ���Ѽ�Ӷ��̳���duck, ��ô���е�Ѽ�Ӷ��ܷ���,�������ⷢ����.

���ھ����Ѽ��������һ����ƤѼ, ��ƤѼ�ܷ���, ����!!!

�������: ���ǽ���ƤѼ����ķ���, ��д���ͺ���.����quackҲ��һ���ĵ���
������, ���������40��Ѽ��, ��20�������, ��10�������, ��ô����Ӧ����ô�찡. ���Ҷ�Ҫ�Լ��ж�, ����Ҳ��һֱ���ظ�

����������������������취
 */
