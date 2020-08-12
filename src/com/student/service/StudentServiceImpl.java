package com.student.service;

import com.student.dao.studentDao;
import com.student.dao.StudentDaoImpl;
import com.student.entity.User;

import java.sql.SQLException;
import java.util.List;

/**
 * @author : zhoumin
 * @data :  2020/8/12 9:51
 */
public class StudentServiceImpl implements StudentService {
  @Override
  public List<User> findAll() throws SQLException {
    studentDao studentDao = new StudentDaoImpl();
    return studentDao.findAll();
  }
}
