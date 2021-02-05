package cn.designPattern.dp.creator._2_FactoryMethod.example1;

import java.util.HashMap;
import java.util.Map;

/**
 * 针对简单工厂的缺点，不能扩展。使用工厂方法
 */
public class Client {
    public static void main(String[] args) {
        FoodFactory factory = new HamburgerFactory();
        Food food = factory.getFood();
        food.eat();

        factory = new BeefFactory();
        Food food1 = factory.getFood();
        food1.eat();
    }
}

class Beef implements  Food{
    @Override
    public void eat() {
        System.out.println("吃牛肉");
    }
}

class BeefFactory implements FoodFactory{

    @Override
    public Food getFood() {
        return new Beef();
    }
}

/*
    工厂方法：
      优点：
        1. 仍然具有简单工厂的优点:服务器端修改了具体产品的类名以后,客户端不知道
        2.当客户端需要扩展一个新的产品时,不需要修改作者原来的代码,只是扩展一个新的工厂而已

      杠点：
       1.我们已经知道,简单工厂也好,工厂方法也好,都有一个优点,就是服务器端的具体产品类名变化了以后,客户端不知道，但是,反观我们现在的代码,客户端仍然依赖于具体的工厂的类名呀!
            此时,如果服务器端修改了具体工厂的类名,那么客户端也要随之一起修改感觉折腾了一圈,又回到了原点角
       解释:工厂的名字,是为视为接口的。作者有责任,有义务,保证工厂的名字是稳定的。
            也就是说,虽然客户端依赖于工厂的具体类名,可是在工T业内所有工厂的名字都是趋向于稳定(并不是100%不会変)。至少工厂类的名字,要比具体产品类的名字更加稳定

       2.既然产品是我们自己客户端扩展出来的,那为什么不直接自己实例化呢?毕竟这个扩展出来的这个产品,我们自己就是作者。我们想怎么改类名自己都能把控!为什么还要为自己制作的产品做工厂呢?
            就是这个牛肉不需要写工厂了，我Food food = new Beef();这样不是很完美嘛！
         解释:因为,作者在开发功能时,不仅仅只会开发一些抽象产品、具体产品、对应的工厂,还会配套地搭配一些提前好的框架。框架用的就是工厂，你这里说不用牛肉工厂，以后怎么使用作者的其他功能

      3. 现在制作出 BeefFactory,是为了能把 BeefFactory 传给作者的功能,所以,必须定义这个 BeefFactory。那为什么不从一开始就让作者的方法方法就直接接受Food参数呢?而不是现在的FoodFactory作为参数。
        解释: 具体类名啊！！！！！！又耦合了。  而且！！！他定义的，你这么改？ 还有作者这么写的好处，就是在作者方法中，获取的是新的类，肯定是自己要用的


     缺点；
       1. 工厂方法模式实现时,客户端需要决定实例化哪一个工厂来实现运算类,选择判断的问题还是存在的,也就是说,工厂方法把简单工厂的内部逻辑判断移到了客户端代码来进行。你想要加功能,本来是改工厂类的,而现在是修改客户端
       2. 一旦产品等级过多，就会爆炸式增长， 食物工厂，饮料工厂，甜点工厂。。。。。完了。
           如果要扩展一个产品类，就需要建立一个相应的工厂类，这样就增加了扩展的难度。
            因为工厂类和产品类的数量相同，维护时需要考虑两个对象之间的关系。
        解决：在复杂的应用中一般采用多工厂的方法，然后再增加一个协调类，避免调用者与各个子工厂交流，协调类的作用是封装子工厂类，对高层模块提供统一的访问接口

       记一下缺点: 马上看抽象工厂。

       当然我的代码还有很多问题，比如每次都是一个新的， 你可以用一个hashmap存起来。示例如下。
 */
 class ProductFactory {
    private static final Map<String,Food> prMap = new HashMap();
    public static synchronized Food createProduct(String type) throws Exception{
        Food product =null;
//如果Map中已经有这个对象
        if(prMap.containsKey(type)){
            product = prMap.get(type);
        }else{
            if(type.equals("Product1")){
                product = new Hamburger();
            }else{
                product = new Noodle();
            }
//同时把对象放到缓存容器中
            prMap.put(type,product);
        }
        return product;
    }
}
