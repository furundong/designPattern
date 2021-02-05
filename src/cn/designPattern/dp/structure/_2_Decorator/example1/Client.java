package cn.designPattern.dp.structure._2_Decorator.example1;

/**
 * create by Freedom on 2021/2/4
 *
 * 本例子摘抄Header first上面的例子. 由于写的好被我拿下来了.
 *
 * 相对于设计模式之禅跟大话设计模式,  我还是觉得Header first确实是略微的通俗易懂一些.
 */
public class Client {
    public static void main(String[] args) {
        Beverage darkRoast = new DarkRoast();
        Decaf decaf = new Decaf();
        Espresso espresso = new Espresso();
        HouseBlend houseBlend = new HouseBlend();
        System.out.println("houseBlend = " + houseBlend);
        System.out.println("decaf = " + decaf);
        System.out.println("darkRoast = " + darkRoast);
        System.out.println("espresso = " + espresso);
    }

}
//ok, 购买咖啡的时候, 里面会要求添加调料, 比如燕奶, 豆浆,摩卡等等...
//第一个想到的是 DarkRoastWithMilk , DarkRoastWithSoy , DarkRoastWithMocha

// 只加了三个调料, 四种咖啡, 现在已经12种类了, 变化一多, 修改起来. . . . 太恐怖了


