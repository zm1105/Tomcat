package com.student.dao;


import com.student.entity.user;

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
  user loginUser(user user);
}
