package com.csmtech.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@Setter
@Getter
@Entity
public class Departments implements Serializable {
	@Id
	@Column(name="department_id")
	private Long departmentId;
	@Column(name="department_name")
	private String departmentName;
	
}
