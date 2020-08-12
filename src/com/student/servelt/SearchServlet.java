package com.student.servelt;

import com.student.entity.User;
import com.student.service.StudentService;
import com.student.service.StudentServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * @author : zhoumin
 * @data :  2020/8/12 9:53
 */
@WebServlet(name = "SearchServlet",urlPatterns = "/Search")
public class SearchServlet extends HttpServlet {
  protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    try {
      StudentService studentService = new StudentServiceImpl();
      List<User> all = studentService.findAll();

    } catch (SQLException e) {
      e.printStackTrace();
    }
  }

  protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    this.doPost(request, response);
  }
}
