package cn.designPattern.dp.structure._2_Decorator.example4;

import java.io.FileNotFoundException;

public class Client {
    public static void main(String[] args) throws FileNotFoundException {
        Component component = new ConcreteComponent();
//��һ������
        ConcreteDecorator1 component1 = new ConcreteDecorator1(component);

//�ڶ�������
        ConcreteDecorator2 component2 = new ConcreteDecorator2(component1);

//���κ�����
        System.out.println("component2.operate() = " + component2.operate());
    }
}
