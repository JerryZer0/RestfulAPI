package com.oocl.RestfulAPI;

import com.oocl.RestfulAPI.EmployeesAPI.Employee;
import com.oocl.RestfulAPI.EmployeesAPI.EmployeeService;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;


public class EmployeeServiceTest {


    List<Employee> employeeList = new ArrayList<>();

    @Test
    public void should_return_the_hole_employee_list(){
        Employee employee1 = new Employee(1,"小明",20,"男");
        Employee employee2 = new Employee(2,"小红",18,"女");
        employeeList.add(employee1);
        employeeList.add(employee2);
        EmployeeService employeeService = new EmployeeService(employeeList);

        assertThat(employeeService.getEmployeeList(),is(employeeList));
    }

    @Test
    public void should_return_the_employee_with_id_is_1_list(){
        Employee employee1 = new Employee(1,"小明",20,"男");
        Employee employee2 = new Employee(2,"小红",18,"女");
        employeeList.add(employee1);
        employeeList.add(employee2);
        EmployeeService employeeService = new EmployeeService(employeeList);

        assertThat(employeeService.getEmployee(1),is(employee1));
    }
}
