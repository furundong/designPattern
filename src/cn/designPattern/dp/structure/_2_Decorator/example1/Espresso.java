package cn.designPattern.dp.structure._2_Decorator.example1;

/**
 * create by Freedom on 2021/2/4
 */
public class Espresso extends Beverage {
    @Override
    public String getDescription() {
        return "Ñ¹Ëõ¿§·È";
    }

    @Override
    public Integer cost() {
        return 4;
    }
}
