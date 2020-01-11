package cn.designPattern.dp.structure._8_Decorator.example1;

/**
 * Component是一个接口或者是抽象类，就是定义我们最核心的对象，也就是最原始的对
 * 象, 如同一个场景 ： 咖啡 + 调料
 * 那么Component就是咖啡
 */
public abstract class Component {
    //抽象的方法
    public abstract String operate();
}
