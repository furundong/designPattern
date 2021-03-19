package cn.designPattern.dp.summary.mvcDemo;

/**
 * create by Freedom on 2021/3/8
 */
public class ActionDispatcher implements IActionDispatcher {
    @Override
    public String actionInvoke(String actionName) {
        return null;
    }

 /*   //ÐèÒªÖ´ÐÐµÄAction
    private ActionManager actionManager = new ActionManager();
    //À¹½ØÆ÷Á´
    private ArrayList<Interceptors> listInterceptors = InterceptorFactory.createInterceptors();
    public String actionInvoke(String actionName) {
    //Ç°ÖÃÀ¹½ØÆ÷
        return actionManager.execAction(actionName);
    //ºóÖÃÀ¹½ØÆ÷
    }*/

}
