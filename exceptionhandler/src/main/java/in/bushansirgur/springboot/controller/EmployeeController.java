package in.bushansirgur.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import in.bushansirgur.springboot.entity.Employee;
import in.bushansirgur.springboot.exceptions.EmployeeNotFoundException;
import in.bushansirgur.springboot.exceptions.ErrorObject;
import in.bushansirgur.springboot.service.EmployeeService;

@RestController
public class EmployeeController {
	
	@Autowired
	EmployeeService eService;
	
	@GetMapping("/employees/{id}")
	public Employee getEmployee (@PathVariable Integer id) {
		return eService.getEmployee(id);
	}
	
	@ExceptionHandler
	public ResponseEntity<ErrorObject> handleException (EmployeeNotFoundException ex) {
		ErrorObject eObject = new ErrorObject(HttpStatus.NOT_FOUND.value(), ex.getMessage(), System.currentTimeMillis());
		return new ResponseEntity<ErrorObject>(eObject, HttpStatus.NOT_FOUND);
	}
}
