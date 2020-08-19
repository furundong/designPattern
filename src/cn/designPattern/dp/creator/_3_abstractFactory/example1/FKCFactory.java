package cn.designPattern.dp.creator._3_abstractFactory.example1;

public class FKCFactory implements Factory{
    @Override
    public Drink getDrink() {
        return new Cola();
    }

    @Override
    public Food getFood() {
        return new Hamburger();
    }
}
