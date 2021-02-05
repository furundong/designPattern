package cn.designPattern.dp.structure._2_Decorator.example3;

import cn.designPattern.dp.structure._2_Decorator.example1.Beverage;

/**
 * create by Freedom on 2021/2/4
 */
public class HouseBlend extends Beverage {
    @Override
    public String getDescription() {
        return "»ìºÏ¿§·È";
    }

    @Override
    public Integer cost() {
        return 1;
    }
}
