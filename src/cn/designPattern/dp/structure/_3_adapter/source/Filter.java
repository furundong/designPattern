package cn.designPattern.dp.structure._3_adapter.source;


/**
 * create by Freedom on 2021/2/7
 */
//public class Filter extends Processor {
//        Applicator.apply( new LowPass(), wf); 如果这里想用, 那你就将发现的Filter去继承Processor,
//        但是我们的Filter是发现来的,没有源代码,只有字节码,不要再源代码上面的修改东西.!!!!!!!!!!!!!(开闭原则)
public class Filter {
    public String name() {
        return this.getClass().getSimpleName();
    }

    public Wareform process(Wareform wareform) {
        return wareform;
    }
}
