package in.bushansirgur.springboot.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import in.bushansirgur.springboot.model.Todo;

@Controller
public class HomeController {
	
	@GetMapping("/todos")
	public ModelAndView getCurrentAndTime() {
		ModelAndView mav = new ModelAndView("home");
		List<Todo> list = new ArrayList<Todo>();
		list.add(new Todo("Learn spring security", "some description", false));
		list.add(new Todo("Prepare lunch", "some description", true));
		list.add(new Todo("Learn php", "some description", false));
		list.add(new Todo("Bring medicine", "some description", true));
		mav.addObject("todos", list);
		return mav;
	}
	
	@GetMapping("/todos1")
	public ModelAndView getCurrentAndTime1() {
		ModelAndView mav = new ModelAndView("home");
		mav.addObject("currentDateAndTime", new Date());
		return mav;
	}
}
