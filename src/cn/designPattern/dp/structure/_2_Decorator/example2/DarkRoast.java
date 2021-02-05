package cn.designPattern.dp.structure._2_Decorator.example2;


/**
 * create by Freedom on 2021/2/4
 */
public class DarkRoast extends Beverage {
    @Override
    public String getDescription() {
        return "½¹ÌÇ¿§·È";
    }

    @Override
    public double cost() {
        return super.cost() + 2;
    }
}
