package com.student.service;


import com.student.entity.user;
import com.student.factory.userDaoFactory;

/**
 * @author : zhoumin
 * @data :  2020/8/11 15:09
 */
public class userService {
  private com.student.dao.UserDao userDao;

  public userService() {
    this.userDao = userDaoFactory.getUserDao();
  }

  /**
   * 根据参数指定的user对象调用DAO实现登录
   *
   * @param
   * @return
   */
  public user userLoginService(user user) {
    return userDao.loginUser(user);
  }
}
