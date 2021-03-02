package cn.designPattern.dp.structure._3_adapter.demo22;

/**
 * create by Freedom on 2021/2/7
 */
class Downcase implements Processor {
    @Override
    public String name() {
        return this.getClass().getSimpleName();
    }

    @Override
    public String process(Object input) {
        return ((String)input).toLowerCase();
    }
}
