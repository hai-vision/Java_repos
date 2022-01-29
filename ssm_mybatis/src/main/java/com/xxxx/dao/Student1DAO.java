package com.xxxx.dao;

import com.xxxx.domain.Student1;
import org.apache.ibatis.annotations.Param;

/**
 * @author hai
 * @date 2022/1/28
 * version 1.0
 */
@SuppressWarnings({"all"})
public interface Student1DAO {
    Student1 queryStudent1ById (@Param("id") Integer id);
}
