package com.Planotech.Employeemangmentsystem.contoroller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import jakarta.servlet.http.HttpSession;

@Controller
public class commoncontroller {
	@GetMapping("/")
	public String loadHome() {
		return "homepage";
	}
	@GetMapping("/about-us")
	public String loadAboutUs() {
		return "AboutUs";
	}

	@GetMapping("/login")
	public String loadLogin() {
		return "login.html";
	}
	@GetMapping("signup")
	public String loadSignup()
	{
		return "Signup";
	}
	
	}



