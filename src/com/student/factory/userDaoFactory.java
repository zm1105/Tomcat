package com.student.factory;


import com.student.dao.UserDao;
import com.student.dao.userDaoImpl;

/**
 * @author : zhoumin
 * @data :  2020/8/11 15:18
 */
public class userDaoFactory {

  /**
   * 工厂方法模式实现userDao实现类对象创建并返回
   * @return
   */
  public static UserDao getUserDao(){
    return new userDaoImpl();
  }
}
