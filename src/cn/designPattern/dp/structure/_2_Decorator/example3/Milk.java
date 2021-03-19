package cn.designPattern.dp.structure._2_Decorator.example3;

/**
 * create by Freedom on 2021/2/4
 */
public class Milk extends CondimentDecorator {
    public Milk(Beverage beverage) {
        super(beverage);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " еёдл";
    }

    @Override
    public Integer cost() {
        return super.cost() + 1;
    }
}
