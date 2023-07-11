package com.spring.model;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
//@RequestMapping("/first")
public class HomeController {
	
	@RequestMapping(path = "/home",method = RequestMethod.GET)
	public String Home(Model model) {	
		model.addAttribute("name","Dil Bhai");
		model.addAttribute("id",23);
		List<String> friends=new ArrayList<String>();
		friends.add("Messi");
		friends.add("Kaka");
		friends.add("pele");
		
		model.addAttribute("f",friends);
		return"home";
		
	}
	
	@RequestMapping("/help")
	public ModelAndView help() {
		ModelAndView modelAndView=new ModelAndView();
		modelAndView.addObject("name","Mahmud");
		modelAndView.addObject("roll", 12);
		
		modelAndView.setViewName("help");
		
		return modelAndView;
	}
}
