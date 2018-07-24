package com.oocl.RestfulAPI.CompaniesAPI;

import com.oocl.RestfulAPI.EmployeesAPI.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
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
}
