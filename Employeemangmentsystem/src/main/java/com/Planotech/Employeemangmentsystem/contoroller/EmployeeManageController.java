package com.Planotech.Employeemangmentsystem.contoroller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.Planotech.Employeemangmentsystem.dto.EmployeeManage;
import com.Planotech.Employeemangmentsystem.service.EmployeeManageService;


@Controller
@RequestMapping("/employee")
public class EmployeeManageController {
	@Autowired
	EmployeeManageService manageService;
	
	@Autowired
	EmployeeManage employeeManage;
	
	@PostMapping("/signup")
	public String signup(EmployeeManage employeeManage,ModelMap map)
	{
		return manageService.signup(employeeManage, map);
	}
}
