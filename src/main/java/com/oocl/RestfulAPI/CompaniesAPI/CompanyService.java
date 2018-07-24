package com.oocl.RestfulAPI.CompaniesAPI;

import com.oocl.RestfulAPI.EmployeesAPI.Employee;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CompanyService {

    List<Company> companies = new ArrayList<>();
    List<Employee> employeeList = new ArrayList<>();
    Employee employee1 = new Employee(1, "小明", 20, "male");
    Employee employee2 = new Employee(2, "小红", 18, "female");

    public CompanyService(List<Company> companies) {
        this.companies = companies;
    }

    public CompanyService() {
        employeeList.add(employee1);
        employeeList.add(employee2);
        Company company1 = new Company(1,"haha",employeeList);
        Company company2 = new Company(2,"heh",employeeList);
        companies.add(company1);
        companies.add(company2);
    }

    public List<Company> getCompanyList() {
        return this.companies;
    }
}
