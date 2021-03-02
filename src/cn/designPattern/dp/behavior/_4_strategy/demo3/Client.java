package cn.designPattern.dp.behavior._4_strategy.demo3;

/**
 * create by Freedom on 2021/2/9
 * �������е�Ѽ�Ӹ�������Ϊ�Ѿ�û�й�ϵ��. ���ǲ�����ϵķ���,��������
 * <p>
 * ��Ȼ�ھ����Ѽ������, �����ֱ�ӽ��ܲ��ܷ�, ��ô��д��, ���Բ���¶�ڿͻ���.
 * �����ʵ���ǿ����ҵ���߼���.
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
