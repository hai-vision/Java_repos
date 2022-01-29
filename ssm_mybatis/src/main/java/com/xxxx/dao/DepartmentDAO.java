package com.xxxx.dao;

import com.xxxx.domain.Department;

import java.util.List;

/**
 * @author hai
 * @date 2022/1/28
 * version 1.0
 */
@SuppressWarnings({"all"})
public interface DepartmentDAO {
    // 查询部门信息，及其所有员工的数量
    Department queryDepartmentOfEmployeesByDeptId(Integer id);
}
