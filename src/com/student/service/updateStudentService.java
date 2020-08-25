package com.student.service;

import com.student.entity.User;

import java.sql.SQLException;

/**
 * @author : zhoumin
 * @data :  2020/8/25 9:42
 */
public interface updateStudentService {
  void  updateStudent(User user) throws SQLException;
}
