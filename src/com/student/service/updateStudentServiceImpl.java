package com.student.service;

import com.student.dao.updateStudentDao;
import com.student.dao.updateStudentImpl;
import com.student.entity.User;

import java.sql.SQLException;

/**
 * @author : zhoumin
 * @data :  2020/8/25 9:47
 */
public class updateStudentServiceImpl implements updateStudentService {
  @Override
  public void updateStudent(User user) throws SQLException {
    updateStudentDao updateStudentDao = new updateStudentImpl();
    updateStudentDao.update(user);
  }
}
