package com.xxxx.domain;

/**
 * @author hai
 * @date 2022/1/28
 * version 1.0
 */
@SuppressWarnings({"all"})
public class Passport {
    private Integer id;
    private String nationality;
    private String expire;
    private Integer passenger_id;

    // 关联属性
    private Passenger passenger;

    public Passport(Integer id, String nationality, String expire, Integer passenger_id) {
        this.id = id;
        this.nationality = nationality;
        this.expire = expire;
        this.passenger_id = passenger_id;
    }

    public Passport () {

    }

    public Passenger getPassenger() {
        return passenger;
    }

    public void setPassenger(Passenger passenger) {
        this.passenger = passenger;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getExpire() {
        return expire;
    }

    public void setExpire(String expire) {
        this.expire = expire;
    }

    public Integer getPassenger_id() {
        return passenger_id;
    }

    public void setPassenger_id(Integer passenger_id) {
        this.passenger_id = passenger_id;
    }

    @Override
    public String toString() {
        return "Passport{" +
                "id=" + id +
                ", nationality='" + nationality + '\'' +
                ", expire='" + expire + '\'' +
                ", passenger_id=" + passenger_id +
                '}';
    }
}
