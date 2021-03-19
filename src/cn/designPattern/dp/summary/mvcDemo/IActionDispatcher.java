package cn.designPattern.dp.summary.mvcDemo;

/**
 * create by Freedom on 2021/3/8
 */
public interface IActionDispatcher {
    //根据Action的名字，返回处理结果
    public String actionInvoke(String actionName);

}
