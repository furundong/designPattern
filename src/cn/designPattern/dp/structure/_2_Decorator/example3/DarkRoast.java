package cn.designPattern.dp.structure._2_Decorator.example3;

/**
 * create by Freedom on 2021/2/4
 */
public class DarkRoast extends Beverage {
    @Override
    public String getDescription() {
        return "���ǿ���";
    }

    @Override
    public Integer cost() {
        return 2;
    }
}
