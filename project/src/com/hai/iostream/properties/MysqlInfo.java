package com.hai.iostream.properties;

import java.io.Serializable;

/**
 * @author hai
 * @date 2022/1/16
 * version 1.0
 */
public class MysqlInfo implements Serializable {
    private String ip;
    private String pwd;
    private String root;

    public MysqlInfo(String ip, String pwd, String root) {
        this.ip = ip;
        this.pwd = pwd;
        this.root = root;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getRoot() {
        return root;
    }

    public void setRoot(String root) {
        this.root = root;
    }

    @Override
    public String toString() {
        return "MysqlInfo{" +
                "ip='" + ip + '\'' +
                ", pwd='" + pwd + '\'' +
                ", root='" + root + '\'' +
                '}';
    }
}
