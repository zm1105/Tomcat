package com.student.service;

import com.student.entity.User;

import java.sql.SQLException;
import java.util.List;

/**
 * @author : zhoumin
 * @data :  2020/8/12 9:50
 */
public interface StudentService {
  /**
   * 查询所有学生的业务
   * @return
   */
  List<User> findAll() throws SQLException;
}
