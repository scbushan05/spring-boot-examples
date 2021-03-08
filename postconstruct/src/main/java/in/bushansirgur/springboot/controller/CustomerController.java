package in.bushansirgur.springboot.controller;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import in.bushansirgur.springboot.service.CustomerService;

@RestController
public class CustomerController {
	
	@Autowired
	CustomerService cService;
	
	public CustomerController() {
		
		System.out.println("Constructor: customer controller");
	}
	
	@PostConstruct
	public void getCustomer() {
		System.out.println(cService.getCustomer());
		System.out.println("get customer");
	}
}
