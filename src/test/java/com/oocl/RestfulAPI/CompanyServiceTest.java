package com.oocl.RestfulAPI;

import com.oocl.RestfulAPI.CompaniesAPI.Company;
import com.oocl.RestfulAPI.CompaniesAPI.CompanyService;
import com.oocl.RestfulAPI.EmployeesAPI.Employee;
import com.oocl.RestfulAPI.EmployeesAPI.EmployeeService;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.mockito.Mockito.mock;

public class CompanyServiceTest {
    List<Employee> employeeList = new ArrayList<>();
    List<Company> companies = new ArrayList<>();
    Employee employee1 = mock(Employee.class);
    Employee employee2 = mock(Employee.class);

    @Test
    public void should_return_the_hole_employee_list(){

        employeeList.add(employee1);
        employeeList.add(employee2);

        Company company1 = new Company(1,"nishu",employeeList);
        Company company2 = new Company(2,"shuia",employeeList);

        companies.add(company1);
        companies.add(company2);

        CompanyService companyService = new CompanyService(companies);

        assertThat(companyService.getCompanyList(),is(companies));
    }
}
