package com.codeWithAbbas.Employee.service;

import com.codeWithAbbas.Employee.Repository.EmployeeRepository;
import com.codeWithAbbas.Employee.entity.Employee;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class EmployeeService {

    private  final EmployeeService  employeeService;

    private final EmployeeRepository employeeRepository;

    public Employee postEmployee(Employee employee){
        return  employeeRepository.save(employee);
    }
}
