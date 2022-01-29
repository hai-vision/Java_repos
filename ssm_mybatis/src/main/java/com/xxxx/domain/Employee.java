package com.xxxx.domain;

/**
 * @author hai
 * @date 2022/1/28
 * version 1.0
 */
@SuppressWarnings({"all"})
public class Employee {
    private Integer id;
    private String name;
    private Double salary;
    private Integer dept_id;

    // 关联属性，一个员工从属于一个部门
    private Department department;

    public Employee () {

    }

    public Employee(Integer id, String name, Double salary, Integer dept_id) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.dept_id = dept_id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public Integer getDept_id() {
        return dept_id;
    }

    public void setDept_id(Integer dept_id) {
        this.dept_id = dept_id;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public Department getDepartment() {
        return department;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                ", dept_id=" + dept_id +
                ", department=" + department +
                '}';
    }
}
