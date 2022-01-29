package com.xxxx.dao;

import com.xxxx.domain.Passenger;

/**
 * @author hai
 * @date 2022/1/28
 * version 1.0
 */
@SuppressWarnings({"all"})
public interface PassengerDAO {
    Passenger queryPassengerById (Integer id);
}
