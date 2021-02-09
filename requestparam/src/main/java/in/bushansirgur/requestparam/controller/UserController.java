package in.bushansirgur.requestparam.controller;

import java.util.List;
import java.util.stream.Stream;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
	
	@GetMapping("/users")
	public String getName(@RequestParam(name = "userName") String name) {
		return "My name is "+name;
	}
	
	@GetMapping("/customers")
	public String getCustomerName(@RequestParam(defaultValue = "anonymous") String name) {
		return "My name is "+name;
	}
	
	@GetMapping("/employees")
	public String getEmployeeName(@RequestParam(required = false) String name) {
		return "My name is "+name;
	}
}
