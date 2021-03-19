package cn.designPattern.dp.structure._2_Decorator.example3;


/**
 * create by Freedom on 2021/2/4
 * <p>
 * ok, ������������������ν��������� . ʹ��װ����
 */
public class Client {
    public static void main(String[] args) {

        Beverage darkRoast = new DarkRoast();

        Milk milk = new Milk(darkRoast);

        System.out.println("milk.getDescription() = " + milk.getDescription());
        System.out.println(milk.cost());

        Mocha mocha = new Mocha(milk);
        System.out.println("mocha.getDescription() = " + mocha.getDescription());
        System.out.println(mocha.cost());
    }
}
