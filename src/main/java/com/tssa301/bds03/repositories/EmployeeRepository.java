package com.tssa301.bds03.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tssa301.bds03.entities.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
