package org.example.services;

import org.example.dto.Employee;

import java.util.List;

public interface EmployeeService {
    public List<Employee> getAll() ;

     boolean saveEmployee(Employee employee);

    void DeleteEmployee(Long id);

    void UpdateEmployee(Employee employee);

    Employee SerchEmployee(Long id);


}
