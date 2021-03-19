package cn.designPattern.dp.structure._3_adapter.source;

/**
 * create by Freedom on 2021/2/7
 */
public class HighPass extends Filter {
    @Override
    public Wareform process(Wareform wareform) {
        return wareform;// Dummy processing —∆ ¥¶ ¿Ì
    }
}
