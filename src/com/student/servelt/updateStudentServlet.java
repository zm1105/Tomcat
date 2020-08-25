package com.student.servelt;

import com.student.entity.User;
import com.student.service.updateStudentService;
import com.student.service.updateStudentServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;

/**
 * @author : zhoumin
 * @data :  2020/8/25 9:51
 */
@WebServlet(name = "updateStudentServlet",urlPatterns = "/Update")
public class updateStudentServlet extends HttpServlet {
  protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    request.setCharacterEncoding("UTF-8");
    try {
      int id = Integer.parseInt(request.getParameter("id"));
      System.out.println(id+"id 00");
      String username = request.getParameter("username");
      System.out.println(username+"username");
      String gender = request.getParameter("gender");
      String birthday = request.getParameter("birthday");
      String email = request.getParameter("email");
      String remarks = request.getParameter("remarks");
      User user = new User(id,username,gender,birthday,email,remarks);
      updateStudentService updateStudentService = new updateStudentServiceImpl();
      updateStudentService.updateStudent(user);
      request.getRequestDispatcher("list.jsp").forward(request, response);
    } catch (SQLException e) {
      e.printStackTrace();
    }
  }

  protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
     this.doPost(request, response);
  }
}
