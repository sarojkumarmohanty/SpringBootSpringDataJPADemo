package com.csmtech.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@Setter
@Getter
@Entity
public class Employees implements Serializable {
	
	@Id
	@Column(name="employee_id")
	private Long employeeId;
	
	@Column(name="last_name")
	private String lastName;
	
	private Double salary;
	
	@Column(name="hire_date")
	private Date hireDate;
	
	@Column(name="job_id")
	private String jobId;
	
	
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name="department_id")
	private Departments departments;
	

}
