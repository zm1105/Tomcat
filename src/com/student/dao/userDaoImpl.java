package com.student.dao;


import com.student.entity.user;

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
  public user loginUser(user user) {
    Connection connection = null;
    PreparedStatement ps = null;
    ResultSet resultSet = null;
    try {
      connection = com.student.common.util.JdbcDruidUtil.getConnection();
      String sql = "select * from user where username=? and password=?";
      ps = connection.prepareStatement(sql);
      ps.setString(1, user.getUsername());
      ps.setString(2, user.getPassword());
      resultSet = ps.executeQuery();
      if (resultSet.next()) {
        user tu = new user(resultSet.getNString("username"), resultSet.getNString("password"));
        return tu;
      }
    } catch (SQLException e) {
      e.printStackTrace();
    } finally {
      com.student.common.util.JdbcDruidUtil.close(resultSet, ps, connection);
    }
    return null;
  }
}
