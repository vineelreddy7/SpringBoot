package com.springrest.springrest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springrest.springrest.entities.Employee;

import springrest.springrest.services.EmployeeService;

@RestController
public class MyController {

@Autowired 
private EmployeeService employeeService;
	
 @GetMapping("/home")
 public String home() {
	   
	 return " Cum & Go Company ";
 }
   
 @GetMapping("/employees")
 public List<Employee> getEmployees()
 {
	return this.employeeService.getEmployees();
 }
   
/* @GetMapping("/employees/{employeeId}")
 public Employee getEmployees()
 {
	 return this.employeeService.getEmployees(id);    	 
 }*/
}