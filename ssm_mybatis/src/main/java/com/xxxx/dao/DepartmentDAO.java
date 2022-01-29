package com.xxxx.dao;

import com.xxxx.domain.Department;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author hai
 * @date 2022/1/28
 * version 1.0
 */
@SuppressWarnings({"all"})
public interface DepartmentDAO {
    // 查询部门信息，及其所有员工的数量
    Department queryDepartmentOfEmployeesByDeptId(Integer deptId);

    // 通过部门ID，查询部门信息
    Department queryDepartmentOfId(@Param("id") Integer id);
}
