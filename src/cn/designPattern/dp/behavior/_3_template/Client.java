package cn.designPattern.dp.behavior._3_template;

/**
 * create by Freedom on 2021/2/5
 */
public class Client {
    public static void main(String[] args) {
        TemplateTime concreteClass = new ConcreteClass();
        concreteClass.template();
    }
}
/*
�ǳ��򵥣�������Ҹ����������ģ�巽��ģʽ��᲻��ܲ�м�أ�����ģʽ��̫���ˣ�
��һֱ��ʹ��ѽ���ǵģ��㾭����ʹ�ã����㲻֪������ģ�巽��ģʽ��
��Щ��ν�ĸ��־Ϳ��Ժ�ţ��˵��
����ģ�巽��ģʽ�Ϳ���ʵ�֡�
���㻹Ҫ�ܳ�ݵؿ��ţ��ۣ�ţ�ˣ�ģ�巽��
ģʽ��ʲôѽ�������ģ�巽��ģʽ��
 */
