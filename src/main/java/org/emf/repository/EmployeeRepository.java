package org.emf.repository;

import org.emf.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by HadoopWorks on 11-06-2017.
 */
@Repository("employeeRepository")
public interface EmployeeRepository extends JpaRepository<Employee,Long> {
}
