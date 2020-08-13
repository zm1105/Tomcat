package com.student.service;

import com.student.dao.addStudent;
import com.student.dao.addStudentImpl;
import com.student.entity.User;

/**
 * @author : zhoumin
 * @data :  2020/8/12 17:23
 */
public class addStudentServiceImpl implements addStudentService {

  @Override
  public int insert(User user) {

    addStudent addStudent = new addStudentImpl();
    int q = addStudent.insert(user);
    System.out.println("service "+ q);
    return q;
  }
}
