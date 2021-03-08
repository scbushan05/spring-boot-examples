package in.bushansirgur.springboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import in.bushansirgur.springboot.model.User;

@RestController
public class UserController {

	@GetMapping("/user")
	public User getUser() {
		
		User user = new User();
		user.setName("Bushan");
		user.setAge(28L);
		user.setLocation("India");
		return user;
		
	}
}
