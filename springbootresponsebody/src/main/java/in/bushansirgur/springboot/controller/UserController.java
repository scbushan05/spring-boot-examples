package in.bushansirgur.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import in.bushansirgur.springboot.model.User;

@Controller
public class UserController {

	@GetMapping("/users")
	public @ResponseBody User getUser() {
		User user = new User();
		user.setFirstName("Bushan");
		user.setLastName("Sirgur");
		user.setAge(28L);
		return user;
	}
}
