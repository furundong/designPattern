package cn.designPattern.dp.creator._1_simpleFactory.example2;

public class Client {
    public static void main(String[] args) {
        Food food = Factory.getFood(1);
        Food food1 = Factory.getFood(2);
        food.eat();
        food1.eat();
    }
}

//找个时候问题就解决了。 那么来说说优缺点

/*
    简单工厂（也叫静态工厂模式）：
       优点：  1.把具体产品的类型,从客户端代码中,解耦出来。
              2.服务器端,如果修改了具体产品的类名,客户端也知道!
              这便符合了“面向接口编程”的思想
       缺点；
            1.客户端不得不死记硬背那些常量与具体产品的映射关系,比如:1对应汉堡包,2对应面条
            2.如何具体产品特别多,则简单工厂,就会变得十分臃肿。比如有19个具体产品,则需要在简单工厂的 switch中写出19个case
            3.最重要的是,变化来了:客户端需要扩展具体产品。 扩展不了啊，服务端是不允许改代码的！

        所以我们就需要根据业务，学习其他设计模式，并使用。 注意了，设计模式不是必须学的，他只是保证你代码，扩展性强，利于修改。（本人曾经做一个mes系统，业务一改，爆炸！！！！）
 */

//这个时候，我就可以跟你说说，spring中是怎么加载类的了。为什么配置了<bean>就做好了。 我用properties代替xml，解析方式一样