package cn.designPattern.dp.structure._2_Decorator.example3;

/**
 * create by Freedom on 2021/2/4
 *
 * ��ʵ������װ������������, ����һ�߼̳�, һ�߹���, ��ô���ԭ���Ĳ�Ʒ���Ե��� �õ��ϵĹ����� , �����ĳ�Ʒ,
 *
 * �����ĳ�Ʒ, ������ӵ�����.  ���ʱ�������֪��ΪʲôҪ�̳����ԭʼ����. ����̳�, ����װ�������ģʽ���ص�!!!!!!!!!!!!1
 *
 *
 */
public class CondimentDecorator extends Beverage {

    protected Beverage beverage;

    public CondimentDecorator(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription();
    }

    @Override
    public Integer cost() {
        return beverage.cost();
    }
}
