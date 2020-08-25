package com.student.dao;

import com.student.entity.User;
import com.student.util.JdbcDruidUtil;
import org.apache.commons.dbutils.QueryRunner;

import java.sql.SQLException;

/**
 * @author : zhoumin
 * @data :  2020/8/25 9:33
 */
public class updateStudentImpl implements updateStudentDao {
  private QueryRunner queryRunner = new QueryRunner(JdbcDruidUtil.getDataSource());

  @Override
  public void update(User user) throws SQLException {
    String sql = "update user set username=? ,gender=?,birthday=?,email=?,remarks=? where id=?";
    int update = queryRunner.update(sql, user.getUsername(), user.getGender(), user.getBirthday(), user.getEmail()
        , user.getRemarks(), user.getId());
  }
}
