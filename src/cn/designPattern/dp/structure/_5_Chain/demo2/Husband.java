package cn.designPattern.dp.structure._5_Chain.demo2;


/**
 * create by Freedom on 2021/3/8
 */
public class Husband extends Handler {
    public Husband() {
        super(Handler.HUSBAND_LEVEL_REQUEST);
    }

    @Override
    protected void response(IWomen women) {
        System.out.println("Ů������ʾ�ǣ�" + women.getRequest());
        System.out.println("�ɷ�Ĵ���:ͬ��");
    }
}
