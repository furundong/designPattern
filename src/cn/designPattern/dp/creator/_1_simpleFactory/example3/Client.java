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
  看到了吗，源码tnn的就是这么简单，慢慢看，不管是什么，未接触很难，接触了就很简单了。
  创建完后，放在容器里（容器其实就是map），聪明的你肯定知道，还有后面肯定是单例了，不过没这么简单。
 */
