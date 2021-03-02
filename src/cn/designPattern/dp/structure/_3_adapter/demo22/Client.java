package cn.designPattern.dp.structure._3_adapter.demo22;

import cn.designPattern.dp.structure._3_adapter.source.HighPass;
import cn.designPattern.dp.structure._3_adapter.source.LowPass;
import cn.designPattern.dp.structure._3_adapter.source.Wareform;

/**
 * create by Freedom on 2021/2/7
 *
 * Filter ���� Processor �������ͬ�Ľӿ�Ԫ�أ�������Ϊ�����Ǽ̳��� Processor ���� ��
 * Ϊ Filter ��Ĵ����߸�����֪�����뽫������ Processor ʹ�� ���� ����㲻�ܽ� Applicator ��
 * apply() ����Ӧ���� Filter ���ϣ���ʹ������Ҳ���������С���Ҫ����Ϊ Applicator �� apply()
 * ������ Processor ������ϣ�����ֹ�� Applicator �� apply() ���������á�����Ҫע���һ����
 * Filter ���� process() ����������������� Waveform��
 * ����� Processor ��һ���ӿڣ���ô���ƾͻ����ɶ������Ը��� Applicator �� apply() ��
 * �������������Ǹ��ӿڲ������������޸ĺ�� Processor �� Applicator �汾��
 *
 * ��һ���ӿڣ���ô���ƾͻ����ɶ�
 * ��һ���ӿڣ���ô���ƾͻ����ɶ�
 * ��һ���ӿڣ���ô���ƾͻ����ɶ�
 * ��Ҫ�Ļ�˵����
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

//������ʹ���������ķ�ʽ�У�FilterAdapter �Ĺ������������еĽӿ� Filter���̶�������Ҫ��
//Processor �ӿڵĶ�������ܻ�ע�⵽ FilterAdapter ��ʹ����ί�С�
//Э���������Ǵ� process() �����в���һ�� Waveform ���� Object ����
//���ӿ���ʵ�ֽ���ʹ�ýӿڿ���Ӧ���ڶ��ֲ�ͬ��ʵ�֣����������߿ɸ����ԡ�
