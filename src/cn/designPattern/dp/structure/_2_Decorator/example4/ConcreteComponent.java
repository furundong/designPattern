package cn.designPattern.dp.structure._2_Decorator.example4;

/**
 * ConcreteComponent������ġ���ԭʼ��������Ľӿڻ�������ʵ�֣���Ҫװ�εľ�������  �����Ǿ���ÿ���
 */
public class ConcreteComponent extends Component {
    //����ʵ��
    @Override
    public String operate() {
        return "do Something";
    }

}
