package cn.designPattern.dp.structure._5_Chain.demo1;

public interface IHandler {
    //一个女性（女儿、妻子或者母亲）要求逛街，你要处理这个请求
    public void HandleMessage(IWomen women);

}
