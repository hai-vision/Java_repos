package com.xxxx.dao;

import com.xxxx.domain.Employee;
import org.apache.ibatis.annotations.Param;

/**
 * @author hai
 * @date 2022/1/28
 * version 1.0
 */
@SuppressWarnings({"all"})
public interface EmployeeDAO {
    Employee queryEmployeeById (@Param("id") Integer id);
}
