package in.bushansirgur.springboot.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.servlet.ModelAndView;

import in.bushansirgur.springboot.model.Country;

@Controller
public class HomeController {
	
	@GetMapping("/countries")
	public ModelAndView getCurrentAndTime() {
		ModelAndView mav = new ModelAndView("home");
		
		return mav;
	}
	
	@ModelAttribute("list")
	public List<Country> getCountries(Model model) {
		List<Country> list = new ArrayList<Country>();
		list.add(new Country("India", "some description", "IND"));
		list.add(new Country("Australia", "some description", "AUS"));
		list.add(new Country("United States", "some description", "US"));
		list.add(new Country("United Kingdom", "some description", "UK"));
		list.add(new Country("Italy", "some description", "IT"));
		return list;
	}
}
