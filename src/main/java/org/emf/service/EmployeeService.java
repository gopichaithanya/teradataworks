package org.emf.service;

import org.emf.model.Employee;

import java.util.List;

/**
 * Created by HadoopWorks on 11-06-2017.
 */

public interface EmployeeService {
    public List<Employee> getAllEmployees();
    public Employee getEmployeeById(long id);
}
