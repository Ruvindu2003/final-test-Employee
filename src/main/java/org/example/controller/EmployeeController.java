package org.example.controller;

import lombok.RequiredArgsConstructor;
import org.example.dto.Employee;
import org.example.services.EmployeeService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("api/employee")
@RequiredArgsConstructor

public class EmployeeController {

    private  final EmployeeService employeeService;

    @GetMapping("/get-All")
    public List<Employee> getAll(){
        return employeeService.getAll();
    }

    @PostMapping("/save-employee")
    public void SaveEmployee(@RequestBody Employee employee){
        employeeService.saveEmployee(employee);
    }

    @DeleteMapping("/Delete/{id}")
    public void DeleteEmployee(@PathVariable Long id){

        employeeService.DeleteEmployee(id);
    }

    @PutMapping("/update")
    public void UpdateEmployee(@RequestBody Employee employee){
        employeeService.UpdateEmployee(employee);
    }

    @GetMapping("Search/{id}")
    public Employee SearchEmployee(@PathVariable  Long id) {
        return employeeService.SerchEmployee(id);


    }

    }
