package com.student.dao;

import com.student.entity.User;

import java.sql.SQLException;

/**
 * @author : zhoumin
 * @data :  2020/8/25 9:27
 */
public interface updateStudentDao {

  /**
   * 修改学生信息
   * @param user
   */
  void update (User user) throws SQLException;
}
