package cn.designPattern.dp.creator._2_FactoryMethod.example1;

public class HamburgerFactory implements FoodFactory {
    @Override
    public Food getFood() {
        return new Hamburger(); // 每次都是一个新的。
    }
}
