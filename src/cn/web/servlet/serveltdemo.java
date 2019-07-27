package cn.web.servlet;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;

@WebServlet(urlPatterns ="/demo01")
public class serveltdemo implements Servlet {
    @Override//初始化创建
    public void init(ServletConfig servletConfig) throws ServletException {

    }

    @Override
    public ServletConfig getServletConfig() {
        return null;
    }

    //提供服务
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("HelloServelet");
    }

    @Override
    public String getServletInfo() {
        return null;
    }

    @Override//销毁
    public void destroy() {

    }
}
