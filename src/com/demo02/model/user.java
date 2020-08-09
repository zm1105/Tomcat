package com.demo02.model;

/**
 * @author : zhoumin
 * @data :  2020/8/7 9:46
 */
public class user {
  private int id;
  private String username;
  private String password;

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

  public user(String username, String password) {

    this.username = username;
    this.password = password;
  }

  public user() {
  }

  @Override
  public String toString() {
    return "user{" +
        "username='" + username + '\'' +
        ", password='" + password + '\'' +
        '}';
  }
}
