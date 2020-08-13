package com.student.dao;

import com.student.entity.User;
import com.student.util.JdbcDruidUtil;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * @author : zhoumin
 * @data :  2020/8/12 9:27
 */
public class StudentDaoImpl implements studentDao {
  private QueryRunner queryRunner = new QueryRunner(JdbcDruidUtil.getDataSource());


  @Override
  public List<User> findAll() {
    try {
      String sql = "select * from user";
      return queryRunner.query(sql, new BeanListHandler<User>(User.class));
    } catch (SQLException e) {
      e.printStackTrace();
      return null;
    }
  }


  @Override
  public List<User> findStudentByPage(int currentPage) {
    return null;
  }


}
