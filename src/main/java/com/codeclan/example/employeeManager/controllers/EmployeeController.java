package com.codeclan.example.employeeManager.controllers;

import com.codeclan.example.employeeManager.models.Department;
import com.codeclan.example.employeeManager.models.Employee;
import com.codeclan.example.employeeManager.models.Project;
import com.codeclan.example.employeeManager.repositories.DepartmentRepository;
import com.codeclan.example.employeeManager.repositories.EmployeeRepository;
import com.codeclan.example.employeeManager.repositories.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;

@RestController
public class EmployeeController {

    @Autowired
    EmployeeRepository employeeRepository;

    @Autowired
    DepartmentRepository departmentRepository;

    @Autowired
    ProjectRepository projectRepository;

    @GetMapping(value = "/employees")
    public List<Employee> getAllEmployees(){
        return employeeRepository.findAll();
    }

    @GetMapping(value = "/departments")
    public List<Employee> getAllDepartments(){
        return departmentRepository.findAll();
    }

    @GetMapping(value = "/projects")
    public List<Employee> getAllProjects(){
        return projectRepository.findAll();
    }

    @GetMapping(value = "/employees/{id}")
    public Optional<Employee> getEmployee(@PathVariable Long id){
        return employeeRepository.findById(id);
    }

    @GetMapping(value = "/departments/{id}")
    public Optional<Department> getDepartment(@PathVariable Long id){
        return departmentRepository.findById(id);
    }

    @GetMapping(value = "/projects/{id}")
    public Optional<Project> getProject(@PathVariable Long id){
        return projectRepository.findById(id);
    }


}
