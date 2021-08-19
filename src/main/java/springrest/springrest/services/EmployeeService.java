package springrest.springrest.services;

import java.util.List;

import springrest.springrest.services.EmployeeService;

import com.springrest.springrest.entities.Employee; 

public interface EmployeeService {
 
	public List<Employee> getEmployees(); 
}
