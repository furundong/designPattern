package cn.designPattern.dp.structure._2_Decorator.example1;

/**
 * create by Freedom on 2021/2/4
 */
public class Decaf extends Beverage {
    @Override
    public String getDescription() {
        return "ÎŞ¿§·ÈÒò¿§·È";
    }

    @Override
    public Integer cost() {
        return 3;
    }
}
