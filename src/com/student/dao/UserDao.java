package com.student.dao;


import com.student.entity.User;

/**
 * @author : zhoumin
 * @data :  2020/8/11 14:13
 */
public interface UserDao {
  /**
   * 登录功能
   * @param user
   * @return
   */
  User loginUser(User user);
}
