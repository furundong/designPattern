package cn.designPattern.dp.creator._3_abstractFactory.example1;

/**
 *  针对工厂方法的缺点，产品等级过多（食物，甜品，饮料），导致类的爆棚。
 */
public class Client {
    public static void main(String[] args) {
        Factory fkcFactory = new FKCFactory();
        StrongTeaFactory strongTeaFactory = new StrongTeaFactory();
        Drink drink = fkcFactory.getDrink();
        Food food = fkcFactory.getFood();
        drink.drink();
        food.eat();
        strongTeaFactory.getDrink().drink();
        strongTeaFactory.getFood().eat();

        new ChihuoFactory().getDrink().drink();//直接开吃。如果是产品簇，抽象工厂是很完美的。但是如果产品等级是多遍的，千万不要用
    }
}

class ChihuoFactory implements Factory{

    @Override
    public Drink getDrink() {
        return new Cola();
    }

    @Override
    public Food getFood() {
        return new Noodle();
    }
}

/*
抽象工厂的优点:
    1.仍然有简单工厂和工厂方法的优点
    2.更重要的是,抽象工厂把工厂类的数量减少了!无论有多少个产品等級,工厂就一套

    杠点:1.为什么三秦工广中,就必须是米线搭配冰峰呢?为什么就不能是米线搭配可乐
        解释:抽象工厂中,可以生产多个产品,这多个产品之间,必须有内在联系。

    缺点：
        1.当,产品等级发生变化时(增加产品等价、删除产品等价),都要引起所有以前工厂代码的修改这就违反了开闭原则”

    有人会问了，这都是最后一个工厂了，怎么还有缺点呢。
        解释：每个设计模式都有缺点，跟优点，并不是说，一个设计模式无敌！

    写了三个了。
        总结一下吧：
        产品等级比较固定，那么使用抽象工厂。  产品簇怎么变，都只是加一个factory的子类。    kfc工厂，浓茶工厂
        或则说，产品不扩充，简单工厂最好了。                                          什么什么食物什么什么甜品
        产品等级经常变化，那么使用工厂方法。                                          食物工厂，
 */