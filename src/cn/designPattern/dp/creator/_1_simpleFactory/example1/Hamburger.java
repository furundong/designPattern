package cn.designPattern.dp.creator._1_simpleFactory.example1;

public class Hamburger implements Food {
    @Override
    public void eat() {
        System.out.println("吃汉堡");
    }
}
