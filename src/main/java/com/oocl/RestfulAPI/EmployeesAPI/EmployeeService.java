package com.oocl.RestfulAPI.EmployeesAPI;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeService {

    List<Employee> employeeList = new ArrayList<>();
    Employee employee1 = new Employee(1,"小明",20,"male");
    Employee employee2 = new Employee(2,"小红",18,"female");
    Employee employee3 = new Employee(3,"小红",18,"male");

    public EmployeeService(List<Employee> employeeList){
        this.employeeList = employeeList;
    }

    public EmployeeService(){
        employeeList.add(employee1);
        employeeList.add(employee2);
        employeeList.add(employee3);
    }

    public List<Employee> getEmployeeList() {
        return this.employeeList;
    }

    public Employee getEmployee(int id) {
        Employee e = employeeList.get(id-1);
        return e;
    }

    public List<Employee> getEmployeeListByGender(String gender) {
        int size = employeeList.size();
        List<Employee> getByGender = new ArrayList<>();
        for(int i=0;i<size;i++){
            if(employeeList.get(i).getGender().equals(gender)){
                getByGender.add(employeeList.get(i));
            }
            System.out.println(size);
        }
        return getByGender;
    }
}
