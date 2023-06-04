package com.dxc.Dao;

import java.util.*;

import com.dxc.EmployeeManagementSystem.Employee;



public interface EmployeeDao {
	public int saveEmployee(String employeeName,int employeeAge, double employeeSalary);
	public List<Employee> getEmployee();
	public void updateEmployee(int empoyeeId, double employeeSalary);
	public void deleteEmployee(int employeeId);

}