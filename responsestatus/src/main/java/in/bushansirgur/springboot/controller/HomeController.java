package in.bushansirgur.springboot.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	
	@GetMapping("/test/{id}")
	public String test (@PathVariable Long id) {
		return "The passed id is "+id;
	}
	
@ResponseStatus(value = HttpStatus.BAD_REQUEST, reason = "Pass integer only")
@ExceptionHandler(IllegalArgumentException.class)
public String handleException (IllegalArgumentException ex) {
	return ex.getMessage();
}
}
