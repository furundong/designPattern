package cn.designPattern.dp.structure._2_Decorator.example1;

/**
 * create by Freedom on 2021/2/4
 *
 * ������ժ��Header first���������. ����д�ĺñ�����������.
 *
 * ��������ģʽ֮���������ģʽ,  �һ��Ǿ���Header firstȷʵ����΢��ͨ���׶�һЩ.
 */
public class Client {
    public static void main(String[] args) {
        Beverage darkRoast = new DarkRoast();
        Decaf decaf = new Decaf();
        Espresso espresso = new Espresso();
        HouseBlend houseBlend = new HouseBlend();
        System.out.println("houseBlend = " + houseBlend);
        System.out.println("decaf = " + decaf);
        System.out.println("darkRoast = " + darkRoast);
        System.out.println("espresso = " + espresso);
    }

}
//ok, ���򿧷ȵ�ʱ��, �����Ҫ����ӵ���, ��������, ����,Ħ���ȵ�...
//��һ���뵽���� DarkRoastWithMilk , DarkRoastWithSoy , DarkRoastWithMocha

// ֻ������������, ���ֿ���, �����Ѿ�12������, �仯һ��, �޸�����. . . . ̫�ֲ���


