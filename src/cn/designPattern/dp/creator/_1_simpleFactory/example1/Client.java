package cn.designPattern.dp.creator._1_simpleFactory.example1;

public class Client {
    public static void main(String[] args) {
        Food food = new Hamburger();
        Food noodle = new Noodle();
        food.eat();
        noodle.eat();
    }
}

//这里的代码没有问题，但是，如果说，服务端，把代码改了，你别管为什么改，反正我就是改了，hamburger改成了hbb，我是客户说了算.
//此时，代码就出现了问题。那么，这种架构是属于很垃圾的。
//所以，example2出来了。


