package com.oocl.RestfulAPI.EmployeesAPI;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeService {

    List<Employee> employeeList = new ArrayList<>();
    Employee employee1 = new Employee(1,"小明",20,"男");
    Employee employee2 = new Employee(2,"小红",18,"女");

    public EmployeeService(List<Employee> employeeList){
        this.employeeList = employeeList;
    }

    public EmployeeService(){
        employeeList.add(employee1);
        employeeList.add(employee2);
    }

    public List<Employee> getEmployeeList() {
        return this.employeeList;
    }
}
