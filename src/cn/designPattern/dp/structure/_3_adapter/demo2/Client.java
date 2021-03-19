package cn.designPattern.dp.structure._3_adapter.demo2;

import cn.designPattern.dp.structure._3_adapter.source.Wareform;

/**
 * create by Freedom on 2021/2/7
 * 以下例子来着java8编程思想
 * <p>
 * 当方法操纵的是一个类而非接口时，它就只能作用于那个类或其子类。如果想把方法应用于那个继
 * 承层级结构之外的类，就会触霉头。接口在很大程度上放宽了这个限制，因而使用接口可以编写复用性
 * 更好的代码。
 * 例如有一个类 Process 有两个方法 name() 和 process()。process() 方法接受输入，修改并
 * 输出。把这个类作为基类用来创建各种不同类型的 Processor。下例中，Processor 的各个子类修改
 * String 对象（注意，返回类型可能是协变类型而非参数类型）：
 */
public class Client {
    public static void main(String[] args) {
        String s = "today is a good day ";

        Applicator.apply(new Upcase(), s);
        Applicator.apply(new Downcase(), s);
        //ok , 现在我们能处理, 但是我们发现了一串代码. 在source包里面, 现在我们发在这俩个代码非常的相似,
        Wareform wf = new Wareform();
//        Applicator.apply( new LowPass(), wf); 如果这里想用, 那你就将发现的Filter去继承Processor,
//        但是我们的Filter是发现来的,没有源代码,只有字节码,不要再源代码上面的修改东西.!!!!!!!!!!!!!(开闭原则)
        //这个处理的逻辑是一样的呀, 但是就是用不了, 这个这后我们应该怎么办????????, 就用适配器模式吧
    }
}

/*
现在我们发现了一组电子滤波器, 它们看起来好像能使用 Applicator 的 apply() 方法：
 */
