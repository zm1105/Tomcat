package com.student.dao;

import com.student.entity.User;

import java.sql.SQLException;
import java.util.List;

/**
 * @author : zhoumin
 * @data :  2020/8/12 8:49
 */
public interface studentDao {
  /**
   * 查询所有学生信息
   *
   * @return
   */
  List<User> findAll() throws SQLException;

}
