package in.bushansirgur.springboot.controller;

import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	
	@GetMapping("/test")
	public String handleRequestHeader (@RequestHeader Map<String, String> mapValues) {
		System.out.println("printing the header"+mapValues);
		return "Success";
	}
}
