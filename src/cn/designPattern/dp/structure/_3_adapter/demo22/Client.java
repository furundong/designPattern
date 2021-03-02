package cn.designPattern.dp.structure._3_adapter.demo22;

import cn.designPattern.dp.structure._3_adapter.source.HighPass;
import cn.designPattern.dp.structure._3_adapter.source.LowPass;
import cn.designPattern.dp.structure._3_adapter.source.Wareform;

/**
 * create by Freedom on 2021/2/7
 *
 * Filter 类与 Processor 类具有相同的接口元素，但是因为它不是继承自 Processor —— 因
 * 为 Filter 类的创建者根本不知道你想将它当作 Processor 使用 —— 因此你不能将 Applicator 的
 * apply() 方法应用在 Filter 类上，即使这样做也能正常运行。主要是因为 Applicator 的 apply()
 * 方法和 Processor 过于耦合，这阻止了 Applicator 的 apply() 方法被复用。另外要注意的一点是
 * Filter 类中 process() 方法的输入输出都是 Waveform。
 * 但如果 Processor 是一个接口，那么限制就会变得松动到足以复用 Applicator 的 apply() 方
 * 法，用来接受那个接口参数。下面是修改后的 Processor 和 Applicator 版本：
 *
 * 是一个接口，那么限制就会变得松动
 * 是一个接口，那么限制就会变得松动
 * 是一个接口，那么限制就会变得松动
 * 重要的话说三遍
 */
public class Client {
    public static void main(String[] args) {
        String s = "today is a ggod day";
        Applicator.apply(new Upcase(), s);
        Applicator.apply(new Downcase(), s);

        Applicator.apply(new FilterAdapter(new LowPass()), new Wareform());
        Applicator.apply(new FilterAdapter(new HighPass()), new Wareform());
    }
}

//在这种使用适配器的方式中，FilterAdapter 的构造器接受已有的接口 Filter，继而产生需要的
//Processor 接口的对象。你可能还注意到 FilterAdapter 中使用了委托。
//协变允许我们从 process() 方法中产生一个 Waveform 而非 Object 对象。
//将接口与实现解耦使得接口可以应用于多种不同的实现，因而代码更具可复用性。
