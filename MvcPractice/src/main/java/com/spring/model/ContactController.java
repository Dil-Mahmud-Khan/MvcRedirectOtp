package com.spring.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import com.spring.model.User;

import Extra.MyMail;
import Extra.MyOTPgen;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


import springmvc.service.UserService;

@Controller
public class ContactController {
	@Autowired
	private UserService userService;
	
	@RequestMapping(path="/contact")
	public String showForm(Model m) {
		m.addAttribute("Header","learn with Dil");
		m.addAttribute("Desc","I am from Tangail");
		return "contact";
	}
	
	
	@RequestMapping(path="/show")
	public String page1() {
		return "Page1";
	}

	
	@RequestMapping(path="/page1Click",method = RequestMethod.POST)
	public String page2() {
		System.out.println("Showing Page2");
		return "Page2";
	}
	
	@RequestMapping("/submitpage2")
	public String submitpage2(@RequestParam("email")String email,Model model) {	
		String otp=MyOTPgen.generateOTP();
		//model.addAttribute("email",email);
		model.addAttribute("otpV","232");
		MyMail.send(email,otp);
		System.out.println(" working");
		return "Page3";
	}

//	@RequestParam("otp")String otp,@RequestParam("genOtp")String genOtp,Model model
//	+(otp==genOtp)
	
	@RequestMapping(path="/submitOtp", method = RequestMethod.POST)
	public String submitpage3() {	
		//System.out.println("Verification: "+(otp==genOtp));

		return "contact";
	}
	
	
	
	@RequestMapping(path="/processform",method=RequestMethod.POST)
	public String handleForm(@ModelAttribute User user, Model model)
	{
		System.out.println(user);
		
		if(user.getUserName().isBlank()) {
			return"redirect:/contact";
		}
		
		this.userService.createUser(user);
		model.addAttribute("Header","learn with Dil");
		model.addAttribute("Desc","I am from Tangail");
		return"success";
	}
		
/*	
	
	@RequestMapping(path="/processform",method=RequestMethod.POST)
	public String handleForm(
			@RequestParam("email") String userEmail,
			@RequestParam("userName") String userName,
			@RequestParam("password") String password,
			Model model
			)
	{
		System.out.println("Email:"+userEmail);
		System.out.println("UserName:"+userName);
		System.out.println("Password:"+password);
		
		
		User user=new User();
		user.setEmail(userEmail);
		user.setUserName(userName);
		user.setPassword(password);

		System.out.println(user);
		
		model.addAttribute("user",user);
		
		
	//	model.addAttribute("name", userName);
	//	model.addAttribute("email", userEmail);
	//	model.addAttribute("password", password);


		
		return"success";
	}
	**/
}

