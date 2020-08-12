package com.student.servelt;


import com.student.entity.User;
import com.student.service.userService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @author : zhoumin
 * @data :  2020/8/11 13:33
 */
@WebServlet(name = "LoginServlet", urlPatterns = "/Login")
public class LoginServlet extends HttpServlet {
  protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    String username = request.getParameter("username");
    String password = request.getParameter("password");
    userService userService = new userService();
    User user = userService.userLoginService(new User(username, password));
    response.setContentType("text/html; charset=UTF-8");
    PrintWriter writer = response.getWriter();
    if (null == user) {
      System.out.println("登录失败");
      writer.write("<h1>登录失败</h1>");
    } else {
      System.out.println("登录成功");
      request.getSession().setAttribute("user",user);
      response.sendRedirect("home_page.jsp");
    }
  }

  protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    this.doPost(request, response);
  }
}
