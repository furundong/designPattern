package cn.designPattern.dp.structure._8_Decorator.example1;

public class Client {
    public static void main(String[] args) {
        Component component = new ConcreteComponent();
//��һ������
        ConcreteDecorator1  component1 = new ConcreteDecorator1(component);

//�ڶ�������
        ConcreteDecorator2  component2 = new ConcreteDecorator2(component1);

//���κ�����
        System.out.println("component2.operate() = " + component2.operate());
    }
}
