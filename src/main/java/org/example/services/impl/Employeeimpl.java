package org.example.services.impl;

import lombok.RequiredArgsConstructor;
import org.example.dto.Employee;
import org.example.entity.Employeeentity;
import org.example.repository.EmployeeRepository;
import org.example.services.EmployeeService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


@Service
@RequiredArgsConstructor


public class Employeeimpl implements EmployeeService {

    private  final ModelMapper modelMapper;
    private  final EmployeeRepository employeeRepository;


    @Override
    public List<Employee> getAll() {

        List<Employee> employeeList=new ArrayList<>();
        List<Employeeentity>employeeEntities=employeeRepository.findAll();

        employeeEntities.forEach(employeeEntity -> {
            employeeList.add(modelMapper.map(employeeEntity, Employee.class)) ;
        });

        return  employeeList;
    }

    @Override
    public boolean saveEmployee(Employee employee) {
        if (employee==null){
            return false;
        }

        employeeRepository.save(modelMapper.map(employee, Employeeentity.class));

        return true;


    }

    @Override
    public void DeleteEmployee(Long id) {

       employeeRepository.deleteById(id);

    }

    @Override
    public void UpdateEmployee(Employee employee) {
        employeeRepository.save(modelMapper.map(employee, Employeeentity.class));



    }

    @Override
    public Employee SerchEmployee(Long id) {

        Optional<Employeeentity>employeeentity=employeeRepository.findById(id);

        return employeeentity.map(entity->modelMapper.map(employeeentity, Employee.class)).orElse(null);




    }
}
