package cn.designPattern.dp.structure._3_adapter.demo22;

import cn.designPattern.dp.structure._3_adapter.source.Filter;
import cn.designPattern.dp.structure._3_adapter.source.Wareform;

/**
 * create by Freedom on 2021/2/7
 * <p>
 * ���ַ�ʽ�����úܺã�Ȼ���㾭��������������޷��޸��ࡣ�����ڵ����˲����������У������
 * �����ֶ����Ǵ����ġ�����Щ����£�����ʹ�����������ģʽ���������������������еĽӿڲ���
 * ��Ҫ�Ľӿڣ����£�
 */
public class FilterAdapter implements Processor {

    Filter filter;

    public FilterAdapter(Filter filter) {
        this.filter = filter;
    }

    @Override
    public String name() {
        return filter.name();
    }

    @Override
    public Object process(Object input) {
        return filter.process((Wareform) input);
    }
}
