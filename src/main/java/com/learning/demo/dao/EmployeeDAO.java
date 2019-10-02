package com.learning.demo.dao;

import java.util.List;

import com.learning.demo.model.EmployeeVO;

public interface EmployeeDAO 
{
	public List<EmployeeVO> getAllEmployees();
}