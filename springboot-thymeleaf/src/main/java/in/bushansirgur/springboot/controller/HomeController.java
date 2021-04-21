package in.bushansirgur.springboot.controller;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	
	@GetMapping("/datetime")
	public ModelAndView getCurrentDateAndTime() {
		ModelAndView mav = new ModelAndView("home");
		mav.addObject("currentDateAndTime", new Date());
		return mav;
	}
}
