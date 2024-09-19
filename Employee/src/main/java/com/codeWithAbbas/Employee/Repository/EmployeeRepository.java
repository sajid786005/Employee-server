package com.codeWithAbbas.Employee.Repository;

import com.codeWithAbbas.Employee.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee,Long> {
}
