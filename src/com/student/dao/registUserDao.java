package com.student.dao;


import com.student.entity.User;
import com.student.util.JdbcDruidUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * @author : zhoumin
 * @data :  2020/8/7 15:29
 */

public class registUserDao {
  public int creatUser(User user) {

    Connection connection = null;
    PreparedStatement preparedStatement = null;
    try {

      connection = JdbcDruidUtil.getConnection();

      String sql = "insert into user (id,username,password)values(null,?,?)";

      preparedStatement = connection.prepareStatement(sql);

      preparedStatement.setString(1, user.getUsername());
      preparedStatement.setString(2, user.getPassword());
      int i = preparedStatement.executeUpdate();
      return i;
    } catch (SQLException e) {
      e.printStackTrace();
      return 0;
    }
  }
}
