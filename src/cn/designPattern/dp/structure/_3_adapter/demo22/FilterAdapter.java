package cn.designPattern.dp.structure._3_adapter.demo22;

import cn.designPattern.dp.structure._3_adapter.source.Filter;
import cn.designPattern.dp.structure._3_adapter.source.Wareform;

/**
 * create by Freedom on 2021/2/7
 * <p>
 * 这种方式运作得很好，然而你经常遇到的情况是无法修改类。例如在电子滤波器的例子中，类库是
 * 被发现而不是创建的。在这些情况下，可以使用适配器设计模式。适配器允许代码接受已有的接口产生
 * 需要的接口，如下：
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
