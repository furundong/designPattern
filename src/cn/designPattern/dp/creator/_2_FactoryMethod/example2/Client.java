package cn.designPattern.dp.creator._2_FactoryMethod.example2;

public class Client {
    public static void main(String[] args) {
//������������¯
        AbstractHumanFactory YinYangLu = new HumanFactory();
//Ů洵�һ�����ˣ�����㣬���ǰ��˲�����
        System.out.println("--����ĵ�һ�����ǰ�ɫ����--");
        Human whiteHuman = YinYangLu.createHuman(WhiteHuman.class);
        whiteHuman.getColor();
        whiteHuman.talk();
//Ů洵ڶ������ˣ������㣬���Ǻ��˲�����
        System.out.println("\n--����ĵڶ������Ǻ�ɫ����--");
        Human blackHuman = YinYangLu.createHuman(BlackHuman.class);
        blackHuman.getColor();
        blackHuman.talk();
//���������ˣ����ոպã����ǻ�ɫ���ֲ�����
        System.out.println("\n--����ĵ��������ǻ�ɫ����--");
        Human yellowHuman = YinYangLu.createHuman(YellowHuman.class);
        yellowHuman.getColor();
        yellowHuman.talk();
    }
}
/*

����һ�ֱȽϾ�����÷��� ��������ģʽ�кܶ���չ������������ģʽ���ʹ�������������¡�
��ô�������Ѿ�����˰취, ����ʵ�Ѿ��Ǹ����󹤳���, ���ǵ�ѡ������ڲ�Ʒ�ȼ�����Ʒ�صı仯.
 */
