package in.bushansirgur.springboot.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import in.bushansirgur.springboot.model.User;

@RestController
public class UserController {
	
	@PostMapping("/users")
	public void printData(@RequestBody User user) {
		System.out.println("Printing the user data:"+user);
	}
}
