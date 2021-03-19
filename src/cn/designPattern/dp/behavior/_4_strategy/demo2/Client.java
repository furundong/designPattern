package cn.designPattern.dp.behavior._4_strategy.demo2;

/**
 * create by Freedom on 2021/2/9
 * <p>
 * ���ǿ�����Ѽ�ӵķ����Լ��з�������, ����������ȡ����, �ŵ�һ�������Ľӿ�,flyable,quackable ����, Ѽ��������������,����ʵ������ӿ�
 * <p>
 * ���˻�˵��. �����ڲ���ûʲô��������. ��jdk1.8�Ժ�, �ӿ�����ķ���, �ǿ�����Ĭ�ϵķ������,��ô�ҾͲ���Ҫ��ʵ������
 * ��������дһ��, �����������
 * <p>
 * ������: �������ǿ�Ѽ�ӵ�quack����, Ѽ��Ĭ�������ɽ�, ��ƤѼ��֨֨,������滹�и���Ľз���??? ��ʮ�ֽз�, Ĭ��ʵ��ֻ��һ��, ���뻹�����ظ�ѽ.
 * ��Ȼ�ŵ�һ�������Ľӿ�,flyable,quackable���Խ��һ���ֵ�����,���������Ǵ�һ��ج����������һ��ج��.
 * <p>
 * ok,��������������������ģʽ, �õǳ���.
 */
public class Client {
    public static void main(String[] args) {
        MallardDuck mallardDuck = new MallardDuck();
        RedHeadDuck redHeadDuck = new RedHeadDuck();
        RubberDuck rubberDuck = new RubberDuck();
        mallardDuck.display();
        mallardDuck.fly();
        mallardDuck.quack();
        mallardDuck.swim();
        System.out.println("-----------------------------");
        redHeadDuck.display();
        redHeadDuck.quack();
        redHeadDuck.fly();
        redHeadDuck.swim();
        System.out.println("-----------------------------");
        rubberDuck.display();
        rubberDuck.swim();
        rubberDuck.quack();
    }
}
