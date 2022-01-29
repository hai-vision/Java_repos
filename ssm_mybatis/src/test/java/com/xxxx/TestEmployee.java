package com.xxxx;

import com.xxxx.dao.EmployeeDAO;
import com.xxxx.domain.Employee;
import com.xxxx.utils.MybatisUtils;

/**
 * @author hai
 * @date 2022/1/28
 * version 1.0
 */
@SuppressWarnings({"all"})
public class TestEmployee {
    public static void main(String[] args) {

        EmployeeDAO mapper = MybatisUtils.getMapper(EmployeeDAO.class);
        Employee employee = mapper.queryEmployeeById(1);
        System.out.println(employee);


    }
}
