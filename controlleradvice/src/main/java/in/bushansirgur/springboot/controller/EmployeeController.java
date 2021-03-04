package in.bushansirgur.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import in.bushansirgur.springboot.entity.Employee;
import in.bushansirgur.springboot.service.EmployeeService;

@RestController
public class EmployeeController {
	
	@Autowired
	EmployeeService eService;
	
	@GetMapping("/employees")
	public List<Employee> getList () {
		return eService.getList();
	}
	
	@GetMapping("/employees/{id}")
	public Employee get (@PathVariable Integer id) {
		return eService.getEmployee(id);
	}  
}
