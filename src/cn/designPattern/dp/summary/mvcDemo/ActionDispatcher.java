package cn.designPattern.dp.summary.mvcDemo;

/**
 * create by Freedom on 2021/3/8
 */
public class ActionDispatcher implements IActionDispatcher {
    @Override
    public String actionInvoke(String actionName) {
        return null;
    }

 /*   //��Ҫִ�е�Action
    private ActionManager actionManager = new ActionManager();
    //��������
    private ArrayList<Interceptors> listInterceptors = InterceptorFactory.createInterceptors();
    public String actionInvoke(String actionName) {
    //ǰ��������
        return actionManager.execAction(actionName);
    //����������
    }*/

}
