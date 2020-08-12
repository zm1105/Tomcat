package com.student.dao;


import com.student.entity.User;
import com.student.util.JdbcDruidUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @author : zhoumin
 * @data :  2020/8/11 14:16
 */
public class userDaoImpl implements UserDao {

  @Override
  public User loginUser(User user) {
    Connection connection = null;
    PreparedStatement ps = null;
    ResultSet resultSet = null;
    try {
      connection = JdbcDruidUtil.getConnection();
      String sql = "select * from user where username=? and password=?";
      ps = connection.prepareStatement(sql);
      ps.setString(1, user.getUsername());
      ps.setString(2, user.getPassword());
      resultSet = ps.executeQuery();
      if (resultSet.next()) {
        User tu = new User(resultSet.getNString("username"), resultSet.getNString("password"));
        return tu;
      }
    } catch (SQLException e) {
      e.printStackTrace();
    } finally {
    JdbcDruidUtil.close(resultSet, ps, connection);
    }
    return null;
  }
}
