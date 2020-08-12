package com.student.test;


import com.student.dao.UserDao;
import com.student.dao.userDaoImpl;
import com.student.entity.User;
import com.student.service.userService;

/**
 * @author : zhoumin
 * @data :  2020/8/11 15:12
 */
public class userTest {
  public static void main(String[] args) {
    UserDao userDao = new userDaoImpl();
   userService userService = new userService();
    User admin = userService.userLoginService(new User("admin", "123456"));
    System.out.println(admin);

  }
}
