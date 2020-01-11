package cn.designPattern.dp.structure._8_Decorator.example1;

/*
һ����һ�������࣬��ʲô���أ�ʵ�ֽӿڻ��߳��󷽷���������ɲ�һ���г���ķ�
��ѽ���������������Ȼ��һ��private����ָ��Component���󹹼���
 */
public abstract class Decorator extends Component {
    private Component component = null;
    //ͨ�����캯�����ݱ�������
    public Decorator(Component _component){
        this.component = _component;
    }
    //ί�и���������ִ��
    @Override
    public String operate() {
       return this.component.operate();
    }
}
