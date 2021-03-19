package cn.designPattern.dp.structure._5_Chain.demo2;

/**
 * create by Freedom on 2021/3/8
 */
public class Son extends Handler {
    public Son() {
        super(Handler.SON_LEVEL_REQUEST);
    }

    @Override
    public void response(IWomen women) {
        System.out.println("女儿的请示是：" + women.getRequest());
        System.out.println("儿子的答复是:同意");
    }
}
