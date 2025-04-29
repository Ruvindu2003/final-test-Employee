package org.example.repository;

import org.example.entity.Employeeentity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employeeentity,Long> {
}
