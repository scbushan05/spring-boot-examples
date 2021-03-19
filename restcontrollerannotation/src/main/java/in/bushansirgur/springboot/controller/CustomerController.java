package in.bushansirgur.springboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import in.bushansirgur.springboot.entity.Customer;

@RestController
public class CustomerController {
	
	@GetMapping("/customer")
	public Customer getCustomer () {
		Customer c = new Customer("Bushan", "India");
		return c;
	}
}
