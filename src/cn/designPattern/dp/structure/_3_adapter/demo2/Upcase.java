package cn.designPattern.dp.structure._3_adapter.demo2;

/**
 * create by Freedom on 2021/2/7
 */
class Upcase extends Processor {
    @Override
    public String process(Object input) {
        return ((String) input).toUpperCase();
    }
}
