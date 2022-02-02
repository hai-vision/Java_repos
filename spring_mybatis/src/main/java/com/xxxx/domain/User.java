package com.xxxx.domain;

import java.util.Date;

/**
 * @author hai
 * @date 2022/2/2
 * version 1.0
 */
@SuppressWarnings({"all"})
public class User {
    private Integer id;
    private String username;
    private String password;
    private Integer gender;
    private Date regist_time;

    public User() {
    }

    public User(Integer id, String username, String password, Integer gender, Date regist_time) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.gender = gender;
        this.regist_time = regist_time;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
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

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public Date getRegist_time() {
        return regist_time;
    }

    public void setRegist_time(Date regist_time) {
        this.regist_time = regist_time;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", gender=" + gender +
                ", regist_time=" + regist_time +
                '}';
    }
}