package cn.designPattern.dp.structure._2_Decorator.example3;

/**
 * create by Freedom on 2021/2/4
 */
public class Mocha extends CondimentDecorator {
    public Mocha(Beverage beverage) {
        super(beverage);
    }

    @Override
    public String getDescription() {
        return super.getDescription()+" Ħ��";
    }

    @Override
    public Integer cost() {
        return super.cost()+2;
    }
}
