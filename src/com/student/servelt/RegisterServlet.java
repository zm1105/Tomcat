package com.student.servelt;


import com.student.dao.registUserDao;
import com.student.entity.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @author : zhoumin
 * @data :  2020/8/7 9:39
 */
@WebServlet(name = "RegisterServlet",urlPatterns = "/register")
public class RegisterServlet extends HttpServlet {
  protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    String username = request.getParameter("username");
    String password = request.getParameter("password");
    User user = new User(username, password);

    registUserDao userDao = new registUserDao();
    int res = userDao.creatUser(user);

    response.setContentType("text/html; charset=UTF-8");
    PrintWriter writer = response.getWriter();
    if (1 == res) {
      System.out.println("注册成功");
      response.sendRedirect("Login.jsp");
    } else {
      System.out.println("注册失败");
      writer.write("<h1>注册失败</h1>");
    }
  }

  protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    this.doPost(request, response);
  }
}
