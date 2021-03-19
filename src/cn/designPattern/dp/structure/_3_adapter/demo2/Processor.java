package cn.designPattern.dp.structure._3_adapter.demo2;

/**
 * create by Freedom on 2021/2/7
 */
public class Processor {
    public String name() {
        return this.getClass().getSimpleName();
    }

    public Object process(Object input) {
        return input;
    }
}
