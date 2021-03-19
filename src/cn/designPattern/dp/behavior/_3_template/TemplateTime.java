package cn.designPattern.dp.behavior._3_template;

/**
 * create by Freedom on 2021/2/5
 */
public abstract class TemplateTime {
    //Ϊ�˷�ֹ����Ĳ�����һ��ģ�巽��������final�ؼ��֣���������д��
    public final void template() {
        /*
         * ���û��������������ص��߼�
         */
        long start = System.currentTimeMillis();
        code();
        long end = System.currentTimeMillis();
        System.out.println("������: " + (end - start));
    }

    //��������
    protected abstract void code();
}
/*
����ģ���еĻ��������������Ϊprotected���ͣ����ϵ����ط��򣬲���Ҫ��¶
�����Ի򷽷�������Ҫ����Ϊprotected���͡�ʵ�������Ǳ�Ҫ��������Ҫ�������еķ���
Ȩ�ޡ�
 */
