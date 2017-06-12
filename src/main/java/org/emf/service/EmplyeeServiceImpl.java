package org.emf.service;

import org.emf.model.Employee;
import org.emf.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by HadoopWorks on 11-06-2017.
 */
@Service("employeeService")
public class EmplyeeServiceImpl implements  EmployeeService {


   
    @Autowired
    private EmployeeRepository employeeRepository;
    @Override
    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }

    @Override
    public Employee getEmployeeById(long id) {
        return employeeRepository.findOne(id);
    }
}
