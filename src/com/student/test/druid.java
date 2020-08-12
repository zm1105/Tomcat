package com.student.test;

import com.student.util.JdbcDruidUtil;

import java.sql.SQLException;

/**
 * @author : zhoumin
 * @data :  2020/8/7 10:27
 */
public class druid {
  public static void main(String[] args) {
    try {
      JdbcDruidUtil.getConnection();
      System.out.println("连接成功");
    } catch (SQLException e) {
      e.printStackTrace();
    }
  }
}
