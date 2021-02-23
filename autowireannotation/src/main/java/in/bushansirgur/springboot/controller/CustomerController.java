package in.bushansirgur.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import in.bushansirgur.springboot.entity.Customer;
import in.bushansirgur.springboot.service.CustomerService;

@RestController
public class CustomerController {
	
	@Autowired
	CustomerService cService;
	
	@GetMapping("/customers")
	public List<Customer> getList() {
		return cService.getCustomerList();
	}
}
