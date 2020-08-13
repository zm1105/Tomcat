package com.student.servelt;


import com.student.entity.User;
import com.student.service.addStudentService;
import com.student.service.addStudentServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author : zhoumin
 * @data :  2020/8/12 17:35
 */
@WebServlet(name = "AddServlet", urlPatterns = "/Add")
public class AddServlet extends HttpServlet {
  protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    addStudentService addStudentService = new addStudentServiceImpl();
    String username = request.getParameter("username");

    String password = request.getParameter("password");
    String gender = request.getParameter("gender");
    String birthday = request.getParameter("birthday");
    String email = request.getParameter("email");
    String remarks = request.getParameter("remarks");
    User user = new User(username, password, gender, birthday, email, remarks);
    System.out.println("servelt" + user);
    int insert = addStudentService.insert(user);
    System.out.println("chenggong?" + insert);
    request.getRequestDispatcher("list.jsp").forward(request, response);
  }

  protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    this.doPost(request, response);
  }
}
