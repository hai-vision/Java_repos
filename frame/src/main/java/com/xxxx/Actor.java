package com.xxxx;

import java.util.Date;

/**
 * @author hai
 * @date 2022/1/23
 * version 1.0
 */
@SuppressWarnings({"all"})
public class Actor {
    private String id;
    private String name;
    private String gender;
    private Date date;
    private String tele;

    public Actor() {

    }

    public Actor(String id, String name, String gender, Date date, String tele) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.date = date;
        this.tele = tele;
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getTele() {
        return tele;
    }

    public void setTele(String tele) {
        this.tele = tele;
    }

    @Override
    public String toString() {
        return "Actor{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", date=" + date +
                ", tele='" + tele + '\'' +
                '}';
    }
}
