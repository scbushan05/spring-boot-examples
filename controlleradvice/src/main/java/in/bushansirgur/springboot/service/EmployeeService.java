package in.bushansirgur.springboot.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import in.bushansirgur.springboot.entity.Employee;
import in.bushansirgur.springboot.exceptions.NoDataFoundException;
import in.bushansirgur.springboot.exceptions.ResourceNotFoundException;

@Service
public class EmployeeService {
	
	private static List<Employee> list = new ArrayList<>();
	
	static {
//		list.add(new Employee(1, "Employee 1", 28, "India"));
//		list.add(new Employee(2, "Employee 2", 29, "India"));
//		list.add(new Employee(3, "Employee 3", 30, "India"));
//		list.add(new Employee(4, "Employee 4", 43, "India"));
//		list.add(new Employee(5, "Employee 5", 55, "India"));
	}
	
	public List<Employee> getList () {
		if (list.size() > 0) {
			return list;
		}
		throw new NoDataFoundException("No employees data found");
		
	}
	
	public Employee getEmployee (Integer id) {
		Optional<Employee> theEmployee = list.stream().filter(e -> e.getId() == id).findFirst();
		if (!theEmployee.isPresent()) {
			throw new ResourceNotFoundException("Employee is not found for the id->"+id);
		}
		return theEmployee.get();
	}
}
