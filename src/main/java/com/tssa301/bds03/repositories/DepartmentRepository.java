package com.tssa301.bds03.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tssa301.bds03.entities.Department;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long> {

}
