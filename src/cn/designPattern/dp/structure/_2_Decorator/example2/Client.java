package cn.designPattern.dp.structure._2_Decorator.example2;

/**
 * create by Freedom on 2021/2/4
 * <p>
 * 针对example2里面的问题, Header First里面给出的办法是在beverage里面加调料的判断, 这个好像可以解决类爆炸的问题, 如下
 * <p>
 * 我们在 Beverage中加入调料的boolean, 需要就加钱
 */
public class Client {
    public static void main(String[] args) {
        Beverage darkRoast = new DarkRoast();
        darkRoast.setMilk(true);
        darkRoast.setMocha(true);
        System.out.println(darkRoast.cost());
        System.out.println("darkRoast.getDescription() = " + darkRoast.getDescription());
    }
}

/*
其他的都差不多, 我就里就写一个表示一下, 具体的写法是一样的.

好像我们解决了这个类爆炸增长的问题, 问题是... 如果这个变化需求来了, 
 1. 又多了一种调料, 我又要进源代码里面修改, 出新品是常有的事
 2. 我想加两份摩卡还是算的一份的钱
 3. 调料的价格一修改, 还是要改源代码
 */
