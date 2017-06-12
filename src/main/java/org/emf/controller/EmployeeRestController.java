package org.emf.controller;

import org.emf.model.Employee;
import org.emf.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by HadoopWorks on 11-06-2017.
 */
@RestController
public class EmployeeRestController {
    @Autowired
    private EmployeeService employeeService;

    @RequestMapping(path="/employees", method= RequestMethod.GET)
    public List<Employee> getAllEmployees(){
        return employeeService.getAllEmployees();
    }
    @RequestMapping(value = "/employee/{id}", method = RequestMethod.GET)
    public Employee getEmployeeById(@PathVariable("id") long id){
        return employeeService.getEmployeeById(id);
    }
}
