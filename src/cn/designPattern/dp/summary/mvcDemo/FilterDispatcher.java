package cn.designPattern.dp.summary.mvcDemo;


import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * create by Freedom on 2021/3/8
 */
public class FilterDispatcher implements Filter {
    //应用IActionDispatcher
    IActionDispatcher actionDispatcher = new ActionDispatcher();
    //定义一个值栈辅助类
    private ValueStackHelper valueStackHelper = new ValueStackHelper();

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        /*
         * 1、检查XML配置文件是否正确
         * 2、启动监控程序，观察配置文件是否正确
         */

    }

    //过滤器必须实现的方法
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain chain) throws IOException, ServletException {
        //转换为HttpServletRequest
        HttpServletRequest request = (HttpServletRequest) servletRequest;
        HttpServletResponse response = (HttpServletResponse) servletResponse;
        //传递到其他过滤器
        chain.doFilter(request, response);
        //获得从HTTP请求的ACTION名称
        String actionName = getActionNameFromURI(request);
        //对ViewManager的应用
        ViewManager viewManager = new ViewManager(actionName);
//        //所有参数放入值栈
//        ValueStack valueStack = valueStackHelper.putIntoStack(request);
//
//        //把所有的请求传递给ActionDispatcher处理
//        String result =actionDispatcher.actionInvoke(actionName);
//        String viewPath = viewManager.getViewPath(result);
//        //直接转向
//        RequestDispatcher rd = request.getRequestDispatcher(viewPath);
//        rd.forward(request, response);

    }

    //servlet销毁时要做的事情
    @Override
    public void destroy() {

    }

    // www.baidu.com/test.html  --> test
    //通过url获得actionName
    private String getActionNameFromURI(HttpServletRequest req) {
        String path = req.getRequestURI();
        return path.substring(path.lastIndexOf("/") + 1, path.lastIndexOf("."));
    }

}
