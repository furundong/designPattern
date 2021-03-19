package cn.designPattern.dp.structure._2_Decorator.example2;

/**
 * create by Freedom on 2021/2/4
 * <p>
 * ���example2���������, Header First��������İ취����beverage����ӵ��ϵ��ж�, ���������Խ���౬ը������, ����
 * <p>
 * ������ Beverage�м�����ϵ�boolean, ��Ҫ�ͼ�Ǯ
 */
public class Client {
    public static void main(String[] args) {
        Beverage darkRoast = new DarkRoast();
        darkRoast.setMilk(true);
        darkRoast.setMocha(true);
        System.out.println(darkRoast.cost());
        System.out.println("darkRoast.getDescription() = " + darkRoast.getDescription());
    }
}

/*
�����Ķ����, �Ҿ����дһ����ʾһ��, �����д����һ����.

�������ǽ��������౬ը����������, ������... �������仯��������, 
 1. �ֶ���һ�ֵ���, ����Ҫ��Դ���������޸�, ����Ʒ�ǳ��е���
 2. ���������Ħ���������һ�ݵ�Ǯ
 3. ���ϵļ۸�һ�޸�, ����Ҫ��Դ����
 */
