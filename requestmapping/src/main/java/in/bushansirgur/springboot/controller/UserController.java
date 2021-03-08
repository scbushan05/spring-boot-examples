package in.bushansirgur.springboot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

	@RequestMapping(value = {"/user", "/user1", "/user2"}, method=RequestMethod.GET)
	public String getUser() {
		return "Success";
	}
}
