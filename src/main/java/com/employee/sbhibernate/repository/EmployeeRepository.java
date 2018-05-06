package com.employee.sbhibernate.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.employee.sbhibernate.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}
