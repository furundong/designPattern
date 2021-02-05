package cn.designPattern.dp.creator._1_simpleFactory.example3;

public class Client {
    public static void main(String[] args) {
        try {
            Food food = Factory.getFood();
            if (food != null) {
                food.eat();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}


/*
  我们先说这么做得优点,
    1. 如果你改变了产品名称, 那么你自己修改一下配置文件里面得信息, 生成得产品是没有问题得.
    2. 当你扩展得时候, 只需要在application.properties修改一下信息, 这个就是数据连接池的源码!!!!!
  看到了吗，源码tnn的就是这么简单，慢慢看，不管是什么，未接触很难，接触了就很简单了。
  创建完后，放在容器里（容器其实就是map），聪明的你肯定知道，还有后面肯定是单例了，不过没这么简单。
 */
