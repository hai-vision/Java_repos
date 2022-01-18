package com.hai.qqcommon;

import java.io.Serializable;

/**
 * @author hai
 * @date 2022/1/18
 * version 1.0
 * 服务器和客户端通信时的用户对象
 */
@SuppressWarnings({"all"})
public class User implements Serializable {
    private String userID;  // 用户id
    private String passwd;  // 密码

    public User(String userID, String passwd) {
        this.userID = userID;
        this.passwd = passwd;
    }

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public String getPasswd() {
        return passwd;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }
}
