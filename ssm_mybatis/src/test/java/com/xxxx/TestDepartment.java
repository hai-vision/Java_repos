package com.xxxx;

import com.xxxx.dao.DepartmentDAO;
import com.xxxx.domain.Department;
import com.xxxx.domain.Employee;
import com.xxxx.utils.MybatisUtils;

import java.util.List;

/**
 * @author hai
 * @date 2022/1/28
 * version 1.0
 */
@SuppressWarnings({"all"})
public class TestDepartment {
    public static void main(String[] args) {
        DepartmentDAO mapper = MybatisUtils.getMapper(DepartmentDAO.class);
        Department department = mapper.queryDepartmentOfEmployeesByDeptId(1);
        System.out.println(department);
        List<Employee> employees = department.getEmployees();
        for (Employee employee : employees) {
            System.out.println(employee);
        }


    }
}
