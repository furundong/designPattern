package cn.designPattern.dp.structure._5_Chain.demo1;

/**
 * create by Freedom on 2021/3/8
 */
public class Husband implements IHandler {
    @Override
    public void HandleMessage(IWomen women) {
        System.out.println("女儿的请示是：" + women.getRequest());
        System.out.println("丈夫的答复是:同意");
    }
}
