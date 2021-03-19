package cn.designPattern.dp.creator._3_abstractFactory.example1;

public class StrongTeaFactory implements Factory {
    @Override
    public Drink getDrink() {
        return new Coffee();
    }

    @Override
    public Food getFood() {
        return new Noodle();
    }
}
