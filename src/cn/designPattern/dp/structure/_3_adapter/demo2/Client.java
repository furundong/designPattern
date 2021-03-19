package cn.designPattern.dp.structure._3_adapter.demo2;

import cn.designPattern.dp.structure._3_adapter.source.Wareform;

/**
 * create by Freedom on 2021/2/7
 * ������������java8���˼��
 * <p>
 * ���������ݵ���һ������ǽӿ�ʱ������ֻ���������Ǹ���������ࡣ�����ѷ���Ӧ�����Ǹ���
 * �в㼶�ṹ֮����࣬�ͻᴥùͷ���ӿ��ںܴ�̶��Ϸſ���������ƣ����ʹ�ýӿڿ��Ա�д������
 * ���õĴ��롣
 * ������һ���� Process ���������� name() �� process()��process() �����������룬�޸Ĳ�
 * ��������������Ϊ���������������ֲ�ͬ���͵� Processor�������У�Processor �ĸ��������޸�
 * String ����ע�⣬�������Ϳ�����Э�����Ͷ��ǲ������ͣ���
 */
public class Client {
    public static void main(String[] args) {
        String s = "today is a good day ";

        Applicator.apply(new Upcase(), s);
        Applicator.apply(new Downcase(), s);
        //ok , ���������ܴ���, �������Ƿ�����һ������. ��source������, �������Ƿ�������������ǳ�������,
        Wareform wf = new Wareform();
//        Applicator.apply( new LowPass(), wf); �����������, ����ͽ����ֵ�Filterȥ�̳�Processor,
//        �������ǵ�Filter�Ƿ�������,û��Դ����,ֻ���ֽ���,��Ҫ��Դ����������޸Ķ���.!!!!!!!!!!!!!(����ԭ��)
        //���������߼���һ����ѽ, ���Ǿ����ò���, ����������Ӧ����ô��????????, ����������ģʽ��
    }
}

/*
�������Ƿ�����һ������˲���, ���ǿ�����������ʹ�� Applicator �� apply() ������
 */
