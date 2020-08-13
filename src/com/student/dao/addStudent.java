package com.student.dao;

import com.student.entity.User;

/**
 * @author : zhoumin
 * @data :  2020/8/13 8:51
 */
public interface addStudent {
  /**
   * 添加学生信息
   *
   * @param user
   */
  int insert(User user);
}
