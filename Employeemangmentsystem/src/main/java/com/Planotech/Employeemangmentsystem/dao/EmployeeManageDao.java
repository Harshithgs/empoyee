package com.Planotech.Employeemangmentsystem.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.Planotech.Employeemangmentsystem.dto.EmployeeManage;
import com.Planotech.Employeemangmentsystem.repository.EmployeeManageRepository;
@Component
public class EmployeeManageDao {
	@Autowired
	EmployeeManageRepository manageRepository;
	
	public List<EmployeeManage> findByEmailAndPhone(String email,long phone)
	{
		return manageRepository.findByEmailAndPhone(email,phone);
	}
	
	public void save(EmployeeManage employeeManage)
	{
		manageRepository.save(employeeManage);
	}
}
