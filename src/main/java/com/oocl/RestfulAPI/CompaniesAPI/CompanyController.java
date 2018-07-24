package com.oocl.RestfulAPI.CompaniesAPI;

import com.oocl.RestfulAPI.EmployeesAPI.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CompanyController {

    @Autowired
    private CompanyService companyService;

    @GetMapping("companies")
    public List<Company> getCompanyList() {
        List<Company> Companies = companyService.getCompanyList();
        return Companies;
    }

    @GetMapping("companies/{id}")
    public Company getCompanyById(@PathVariable int id) {
        Company company = companyService.getCompany(id);
        return company;
    }

    @GetMapping("companies/{id}/employees")
    public List<Employee> getEmployeesByCompanyId(@PathVariable int id) {
        List<Employee> employeeList = companyService.getEmployeesByCompanyId(id);
        return employeeList;
    }
}
