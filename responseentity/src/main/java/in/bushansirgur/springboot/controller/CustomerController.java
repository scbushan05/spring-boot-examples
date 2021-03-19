package in.bushansirgur.springboot.controller;

import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import in.bushansirgur.springboot.entity.Customer;

@RestController
public class CustomerController {
	
	@GetMapping("/customer")
	public ResponseEntity<Customer> getCustomer () {
		Customer c = new Customer("Customer 1", "India");
		HttpHeaders headers = new HttpHeaders();
		headers.add("token", "token value");
		return ResponseEntity.ok().headers(headers).body(c);
	}
}