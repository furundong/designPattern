package cn.designPattern.dp.creator._3_abstractFactory.example1;

public class Hamburger implements Food {
    @Override
    public void eat() {
        System.out.println("吃汉堡");
    }
}
