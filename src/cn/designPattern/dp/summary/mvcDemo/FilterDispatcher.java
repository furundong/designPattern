package cn.designPattern.dp.summary.mvcDemo;


import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * create by Freedom on 2021/3/8
 */
public class FilterDispatcher implements Filter {
    //Ӧ��IActionDispatcher
    IActionDispatcher actionDispatcher = new ActionDispatcher();
    //����һ��ֵջ������
    private ValueStackHelper valueStackHelper = new ValueStackHelper();

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        /*
         * 1�����XML�����ļ��Ƿ���ȷ
         * 2��������س��򣬹۲������ļ��Ƿ���ȷ
         */

    }

    //����������ʵ�ֵķ���
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain chain) throws IOException, ServletException {
        //ת��ΪHttpServletRequest
        HttpServletRequest request = (HttpServletRequest) servletRequest;
        HttpServletResponse response = (HttpServletResponse) servletResponse;
        //���ݵ�����������
        chain.doFilter(request, response);
        //��ô�HTTP�����ACTION����
        String actionName = getActionNameFromURI(request);
        //��ViewManager��Ӧ��
        ViewManager viewManager = new ViewManager(actionName);
//        //���в�������ֵջ
//        ValueStack valueStack = valueStackHelper.putIntoStack(request);
//
//        //�����е����󴫵ݸ�ActionDispatcher����
//        String result =actionDispatcher.actionInvoke(actionName);
//        String viewPath = viewManager.getViewPath(result);
//        //ֱ��ת��
//        RequestDispatcher rd = request.getRequestDispatcher(viewPath);
//        rd.forward(request, response);

    }

    //servlet����ʱҪ��������
    @Override
    public void destroy() {

    }

    // www.baidu.com/test.html  --> test
    //ͨ��url���actionName
    private String getActionNameFromURI(HttpServletRequest req) {
        String path = req.getRequestURI();
        return path.substring(path.lastIndexOf("/") + 1, path.lastIndexOf("."));
    }

}
