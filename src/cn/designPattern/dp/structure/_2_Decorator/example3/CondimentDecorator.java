package cn.designPattern.dp.structure._2_Decorator.example3;

/**
 * create by Freedom on 2021/2/4
 *
 * 其实真正的装饰器是在这里, 这里一边继承, 一边关联, 那么你的原来的产品可以当作 该调料的构造器 , 出来的成品,
 *
 * 出来的成品, 你又想加调料了.  这个时候你就能知道为什么要继承这个原始类了. 这个继承, 就是装饰者设计模式的重点!!!!!!!!!!!!1
 *
 *
 */
public class CondimentDecorator extends Beverage {

    protected Beverage beverage;

    public CondimentDecorator(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription();
    }

    @Override
    public Integer cost() {
        return beverage.cost();
    }
}
