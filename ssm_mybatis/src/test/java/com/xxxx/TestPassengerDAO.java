package com.xxxx;

import com.xxxx.dao.PassengerDAO;
import com.xxxx.domain.Passenger;
import com.xxxx.utils.MybatisUtils;

/**
 * @author hai
 * @date 2022/1/28
 * version 1.0
 */
@SuppressWarnings({"all"})
public class TestPassengerDAO {
    public static void main(String[] args) {
        PassengerDAO mapper = MybatisUtils.getMapper(PassengerDAO.class);
        Passenger passenger = mapper.queryPassengerById(1);
        System.out.println(passenger);
    }
}
