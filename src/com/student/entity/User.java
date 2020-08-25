package com.student.entity;

import java.util.Date;

/**
 * @author : zhoumin
 * @data :  2020/8/7 9:46
 */
public class User {
  private int id;
  private String username;
  private String password;
  private String gender;
  private String birthday;
  private String email;
  private String remarks;

  public String getGender() {
    return gender;
  }

  public void setGender(String gender) {
    this.gender = gender;
  }

  public String getBirthday() {
    return birthday;
  }

  public void setBirthday(String birthday) {
    this.birthday = birthday;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getRemarks() {
    return remarks;
  }

  public void setRemarks(String remarks) {
    this.remarks = remarks;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public User( String username, String password, String gender, String birthday, String email, String remarks) {
    this.username = username;
    this.password = password;
    this.gender = gender;
    this.birthday = birthday;
    this.email = email;
    this.remarks = remarks;
  }

  public User(int id, String username, String gender, String birthday, String email, String remarks) {
    this.id = id;
    this.username = username;
    this.gender = gender;
    this.birthday = birthday;
    this.email = email;
    this.remarks = remarks;
  }

  public User(String username, String password) {
    this.username = username;
    this.password = password;
  }

  public User() {
  }

  @Override
  public String toString() {
    return "User{" +
        "id=" + id +
        ", username='" + username + '\'' +
        ", password='" + password + '\'' +
        ", gender='" + gender + '\'' +
        ", birthday=" + birthday +
        ", email='" + email + '\'' +
        ", remarks='" + remarks + '\'' +
        '}';
  }
}
