package com.hai.jdbc;

/**
 * @author hai
 * @date 2022/1/23
 * version 1.0
 */
@SuppressWarnings({"all"})
public class Actor {
    private String id;
    private String username;

    public Actor () {

    }

    public Actor(String id, String username) {
        this.id = id;
        this.username = username;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public String toString() {
        return "Actor{" +
                "id='" + id + '\'' +
                ", username='" + username + '\'' +
                '}';
    }
}
