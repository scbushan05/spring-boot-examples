package in.bushansirgur.springboot.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import in.bushansirgur.springboot.model.User;

@RestController
public class UserController {

	@PostMapping("/users")
	public String printUser(@RequestBody User user) {
		System.out.println("printing the user object: "+user);
		return "Success";
	}
}
