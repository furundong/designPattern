package cn.designPattern.dp.creator._5_Prototype.example3;

public class Client {
    public static void main(String[] args) throws CloneNotSupportedException {
//����һ������
        Thing thing = new Thing();
//����һ��ֵ
        thing.setValue("����");
//����һ������
        Thing cloneThing = thing.clone();
        cloneThing.setValue("����");
        System.out.println(thing.getArrayList());
    }
}

/*
�������������һ�Ρ�Ϊʲô���������أ�
    Object���ṩ
�ķ���cloneֻ�ǿ���������������ڲ������顢���ö���ȶ�������������ָ��ԭ������
���ڲ�Ԫ�ص�ַ�����ֿ����ͽ���ǳ������ȷʵ�Ƿǳ�ǳ��������������һ��˽�б�����
����ҸĴ�Ҷ��ܸģ���һ�ַǳ�����ȫ�ķ�ʽ����ʵ����Ŀ��ʹ�û��ǱȽ��ٵģ���Ȼ��
��Ҳ��һ�֡�Σ����������һ�־�����ʽ����

����ܻ�Ƚ���֣�Ϊʲô��Mail�Ǹ����оͿ���ʹ��String���ͣ������������ǳ���������������أ��ڲ�����������ö���Ų�������
������ԭʼ���ͱ���int��long��char�ȶ��ᱻ���������Ƕ���String���ͣ�Java��ϣ�������
��Ϊ�ǻ������ͣ�����û��clone�����ģ��������Ҳ�Ƚ����⣬ͨ���ַ����أ�stringpool��
����Ҫ��ʱ������ڴ��д����µ��ַ�����������ʹ�õ�ʱ��Ͱ�String����������ʹ�ü��ɡ�����˵stringҲ��������ͣ���Ȼ���ǣ����������������


����ͼ��������⡣ ok����������һ��example4�����һ�¡�

 */
