package com.student.dao;

import com.student.entity.User;
import com.student.util.JdbcDruidUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.SimpleDateFormat;

/**
 * @author : zhoumin
 * @data :  2020/8/13 8:51
 */
public class addStudentImpl implements addStudent {

  @Override
  public int insert(User user) {
    System.out.println("dao user"+user);
    try {
      Connection connection = JdbcDruidUtil.getConnection();
      String sql = "insert into user values(null,?,?,?,?,?,?)";
      PreparedStatement ps = connection.prepareStatement(sql);
      ps.setString(1, user.getUsername());
      ps.setString(2, user.getPassword());
      ps.setString(3, user.getGender());
      ps.setString(4, user.getBirthday());
      ps.setString(5, user.getEmail());
      ps.setString(6, user.getRemarks());
      int i = ps.executeUpdate();
      System.out.println(i+ "dao");
      return i;
    } catch (SQLException e) {
      e.printStackTrace();
      return 0;
    }
  }
}
