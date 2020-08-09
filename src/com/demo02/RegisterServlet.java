package com.demo02;

import com.demo02.dao.userDao;
import com.demo02.model.user;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

/**
 * @author : zhoumin
 * @data :  2020/8/7 9:39
 */
public class RegisterServlet extends HttpServlet {
  protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    String username = request.getParameter("username");
    String password = request.getParameter("password");
    user user = new user(username, password);

    userDao userDao = new userDao();
    int res = userDao.creatUser(user);

    response.setContentType("text/html; charset=UTF-8");
    PrintWriter writer = response.getWriter();
    if (1 == res) {
      System.out.println("注册成功");
      writer.write("<h1>注册成功</h1>");
    } else {
      System.out.println("注册失败");
      writer.write("<h1>注册失败</h1>");
    }
  }

  protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    this.doPost(request, response);
  }
}
