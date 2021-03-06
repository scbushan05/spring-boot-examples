package in.bushansirgur.springboot.controller;

import javax.validation.Valid;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import in.bushansirgur.springboot.entity.Customer;

@RestController
public class CustomerController {
	
	@PostMapping("/test")
	public String test (@Valid @RequestBody Customer customer) {
		return "Success";
	}
}
