package com.csmtech.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.csmtech.model.Employees;

@Repository
public interface EmployeeRepository extends JpaRepository<Employees, Long> {

	@Query("select e.employeeId, e.lastName,e.departments.departmentName FROM Employees e")
	List<Object[]> findEmployeesByDepartmentId(String departmentName);
	
	
	List<Employees> findByLastName(String lastName);
	List<Employees> findByJobIdAndSalary(String jobId, Double salary);
	List<Employees> findByJobIdOrSalary(String jobId, Double salary);
	List<Employees> findBySalaryBetween(Double salary,Double salary1);
	List<Employees> findByHireDateBetween(Date fromDate, Date toDate);
}
