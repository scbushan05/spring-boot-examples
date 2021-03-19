package in.bushansirgur.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	
	@RequestMapping("/name")
	public ModelAndView displayName () {
		ModelAndView mav = new ModelAndView("hello-world");
		mav.addObject("name", "Bushan");
		return mav;
	}
}
