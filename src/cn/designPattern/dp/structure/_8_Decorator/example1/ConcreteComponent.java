package cn.designPattern.dp.structure._8_Decorator.example1;

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