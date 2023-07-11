package com.spring.model;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class ReController {
	@RequestMapping("/one")
	public String one() {
		System.out.println("this is one");
		return "redirect:/enjoy";
	}
//	
//	@RequestMapping("/one")
//	public RedirectView one() {
//		System.out.println("this is one");
//		RedirectView redirectView=new RedirectView();
//		redirectView.setUrl("/enjoy");
//		redirectView.setUrl("http://www.google.com");
//		return redirectView;
//	}
	
	
	@RequestMapping("/enjoy")
	public String two() {
		System.out.println("this is two");
		return "contact";
	}
}
