package cn.designPattern.dp.creator._6_Bulider.demo1;

/**
 * �淶��Ʒ���齨��һ����������ʵ�֡�
 */
public abstract class Builder {
    //���ò�Ʒ�Ĳ�ͬ���֣��Ի�ò�ͬ�Ĳ�Ʒ
    public abstract void setPart();

    //�����Ʒ
    public abstract Product buildProduct();  //����Ѳ�����ã�׼�����ء�  ��ʵ����Ĳ�ƷӦ���ٳ���һ�ѣ�������������Ӧ���еġ�
}
