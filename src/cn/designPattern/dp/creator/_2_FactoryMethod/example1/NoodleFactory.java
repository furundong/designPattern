package cn.designPattern.dp.creator._2_FactoryMethod.example1;

public class NoodleFactory implements FoodFactory {
    @Override
    public Food getFood() {
        return new Noodle();
    }
}
