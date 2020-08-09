package com.demo02.dao;

import com.demo02.model.user;
import com.demo02.util.JdbcDruidUtil;

import java.io.Reader;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * @author : zhoumin
 * @data :  2020/8/7 15:29
 */

public class userDao {
  public int creatUser(user user) {
    System.out.println(user);

    Connection connection = null;
    PreparedStatement preparedStatement = null;
    try {

      connection = JdbcDruidUtil.getConnection();

      String sql = "insert into user values(null,?,?)";

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

  public static void main(String[] args) throws SQLException {
    userDao userDao = new userDao();
    user u =new user("why777","2526565");
    userDao.creatUser(u);
  }
}
