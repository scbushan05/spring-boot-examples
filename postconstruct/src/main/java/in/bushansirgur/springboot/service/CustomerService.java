package in.bushansirgur.springboot.service;

import org.springframework.stereotype.Service;

import in.bushansirgur.springboot.entity.Customer;

@Service
public class CustomerService {
	
	public CustomerService() {
		System.out.println("Constructor: customerService");
	}
	
	public Customer getCustomer () {
		return new Customer("Bushan", "India");
	}
}
