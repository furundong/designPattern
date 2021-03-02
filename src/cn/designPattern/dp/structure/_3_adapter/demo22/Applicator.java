package cn.designPattern.dp.structure._3_adapter.demo22;

/**
 * create by Freedom on 2021/2/7
 */
public class Applicator {
    public static void apply(Processor p, Object o){
        System.out.println("Using Processor ");
        System.out.println(p.process(o));
    }
}
