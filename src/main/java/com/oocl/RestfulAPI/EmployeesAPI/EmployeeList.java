package com.oocl.RestfulAPI.EmployeesAPI;

import java.util.ArrayList;
import java.util.List;

public class EmployeeList {
    private List<Employee> employees = new ArrayList<>();

    EmployeeList(){

    }

    public void add(Employee employee){
        employees.add(employee);
    }

    public List<Employee> getAllEmployees(){
        return employees;
    }
    public void setEmployee(List<Employee> employees){
        this.employees = employees;
    }

    public Employee findById(int id){
        Employee employee = employees.get(id-1);
        return employee;
    }

    public void update(int id,Employee employee){
        employees.remove(id);
        employee.setId(id);
        employees.add(employee);
    }

    public void delete(int id){
        employees.remove(id);
    }

    public void delete(Employee employee){
        employees.remove(employee);
    }
}
