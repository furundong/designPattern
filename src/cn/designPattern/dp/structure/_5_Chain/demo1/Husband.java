package cn.designPattern.dp.structure._5_Chain.demo1;

/**
 * create by Freedom on 2021/3/8
 */
public class Husband implements IHandler {
    @Override
    public void HandleMessage(IWomen women) {
        System.out.println("Ů������ʾ�ǣ�" + women.getRequest());
        System.out.println("�ɷ�Ĵ���:ͬ��");
    }
}
