package com.xxxx.dao;

import com.xxxx.domain.Passport;

/**
 * @author hai
 * @date 2022/1/28
 * version 1.0
 */
@SuppressWarnings({"all"})
public interface PassportDAO {
    Passport queryPassportById (Integer id);

}
