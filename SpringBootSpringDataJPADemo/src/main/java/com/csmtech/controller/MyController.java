package com.csmtech.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.csmtech.model.Employees;
import com.csmtech.repository.EmployeeRepository;

@Controller
public class MyController {

	@Autowired
	private EmployeeRepository employeeRepository;

	@RequestMapping(path = "/getEmpForm")
	public String getEmpData() {
		return "empform";
	}

	@RequestMapping(path = "/getEmpData",method = RequestMethod.POST)
	public String saveEmpData(@RequestParam("fromDate") @DateTimeFormat(pattern = "dd-MM-yyyy") Date fromDate,@RequestParam("toDate") @DateTimeFormat(pattern = "dd-MM-yyyy") Date toDate, Model model) {
		
		List<Employees>	empList = employeeRepository.findByHireDateBetween(fromDate, toDate);
		//empList.forEach(x -> System.out.println(x));
		model.addAttribute("empList", empList);
		return "forward:/getEmpForm";
	}

}
