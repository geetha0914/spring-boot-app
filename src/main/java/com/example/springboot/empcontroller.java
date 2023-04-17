package com.example.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class empcontroller {
	@Autowired
	empinterface empRepository;
	
	@GetMapping("/sayHello")
	public String sayHello() {
		return "Hello world from sayhello() method";
		
	}
	@GetMapping("/regEmp")
	public empclass registerEmployee() {
		empclass emp = new empclass(101,"Geetha",10000);
		empclass savedEmp = empRepository.save(emp);
		//return " Employee " + savedEmp.getEmpName() + " stored in the database ";
		return savedEmp;
		
	}
	@GetMapping("/getEmp")
	public String getEmployee() {
		empclass emp = empRepository.findById(101).get();
		return emp.getEmpName() + "|" + emp.getSalary();
	}
		
		@PostMapping("/createEmp")
		public empclass createEmployee(@RequestBody empclass emp) {
		return empRepository.save(emp);
		
		}
		
		@GetMapping("/getEmp/{empId}")
		public empclass getEmployeeDetails(@PathVariable(value="empId")int empId) {
		return empRepository.findById(empId).get();
		}
	
	
	}



