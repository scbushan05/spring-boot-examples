package in.bushansirgur.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import in.bushansirgur.springboot.entity.Customer;

@Controller
public class CustomerController {
	
	@GetMapping("/customer")
	public String getCustomer () {
		return "customer";
	}
	
	@ModelAttribute("customer")
	public Customer customer() {
		return new Customer("Bushan", 28L, "India");
	}
}
