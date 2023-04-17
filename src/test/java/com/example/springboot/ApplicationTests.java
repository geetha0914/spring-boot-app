package com.example.springboot;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ApplicationTests {

	
	 
	@Autowired
	empcontroller empcontroller;
	@Test
	void contextLoads() {
	}
	
	@Test
	void testSayHellomethod() {
		assertEquals("Hello world from sayhello() method",empcontroller.sayHello());
	}
	
	@Test
	void testCreateEmployeemethod() {
		empclass emp = new empclass(101,"kavita",10000);
		assertEquals(emp.getEmpId(), empcontroller.createEmployee(emp).getEmpId());
	}
}
	

