package in.bushansirgur.springboot.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import in.bushansirgur.springboot.entity.Employee;
import in.bushansirgur.springboot.exceptions.EmployeeNotFoundException;

@Service
public class EmployeeService {
	
	private static List<Employee> list = new ArrayList<>();
	
	static {
		Employee e = new Employee(1, "Employee 1", 28, "India");
		list.add(e);
		
		e = new Employee(2, "Employee 2", 25, "India");
		list.add(e);
		
		e = new Employee(3, "Employee 3", 30, "India");
		list.add(e);
		
		e = new Employee(4, "Employee 4", 48, "India");
		list.add(e);
		
		e = new Employee(5, "Employee 5", 27, "India");
		list.add(e);
	}
	
	public Employee getEmployee (Integer id) {
		Optional<Employee> theEmployee = list.stream().filter(e -> e.getId() == id).findFirst();
		if (!theEmployee.isPresent()) {
			throw new EmployeeNotFoundException("Employee not found for the id ->"+id);
		}
		return theEmployee.get();
	}
}
