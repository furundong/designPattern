package cn.designPattern.dp.creator._2_FactoryMethod.example4;

/**
 * 何为延迟初始化（Lazy initialization）？一个对象被消费完毕后，并不立刻释放，工厂类
 * 保持其初始状态，等待再次被使用。延迟初始化是工厂方法模式的一个扩展应用，
 * <p>
 * 所以我们应该放在一个容器中，看，是不是跟spring越来越接近了，example3里面还有单例。慢慢来不着急
 * 这里就根据example1来创建容器。怕一次太多设计模式，晕乎乎。（可能我是怕写不来，哈哈哈哈，很尴尬。 好，既然都说到这里了！！！那么，当我没说）
 * 就多一个map很简单的。
 * <p>
 * 注意：这里不是工厂方法了。
 */
public class Client {
    public static void main(String[] args) {
        Food product = FoodFactory.createProduct("1");  //对外是看不到容器的
        product.eat();
    }
}
