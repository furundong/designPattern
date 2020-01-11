package cn.designPattern.dp.structure._8_Decorator.example1;

/**
 * ConcreteComponent是最核心、最原始、最基本的接口或抽象类的实现，你要装饰的就是它。  他就是具体得咖啡
 */
public class ConcreteComponent extends Component {
    //具体实现
    @Override
    public String operate() {
        return "do Something";
    }

}