package cn.designPattern.dp.structure._3_adapter.source;


/**
 * create by Freedom on 2021/2/7
 */
//public class Filter extends Processor {
//        Applicator.apply( new LowPass(), wf); �����������, ����ͽ����ֵ�Filterȥ�̳�Processor,
//        �������ǵ�Filter�Ƿ�������,û��Դ����,ֻ���ֽ���,��Ҫ��Դ����������޸Ķ���.!!!!!!!!!!!!!(����ԭ��)
public class Filter {
    public String name() {
        return this.getClass().getSimpleName();
    }

    public Wareform process(Wareform wareform) {
        return wareform;
    }
}
