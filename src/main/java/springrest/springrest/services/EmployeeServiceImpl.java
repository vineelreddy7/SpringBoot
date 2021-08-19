package springrest.springrest.services;

import java.util.*;

import org.springframework.stereotype.Service;

import com.springrest.springrest.entities.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	List<Employee> list;
	
	public EmployeeServiceImpl() {
	
		list = new ArrayList<>();
		list.add(new Employee(120, "Jason",12000));
		list.add(new Employee(200, "brad" ,10000));
		list.add(new Employee(250, "Chris",14000));
	}	
	
@Override
	public List<Employee> getEmployees() {
		
		return list;
}
}

