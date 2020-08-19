package cn.designPattern.dp.structure._8_Decorator.example1;

public class Client {
    public static void main(String[] args) {
        Component component = new ConcreteComponent();
//第一次修饰
        ConcreteDecorator1  component1 = new ConcreteDecorator1(component);

//第二次修饰
        ConcreteDecorator2  component2 = new ConcreteDecorator2(component1);

//修饰后运行
        System.out.println("component2.operate() = " + component2.operate());
    }
}
