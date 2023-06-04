package com.dxc.client;

import java.util.List;
import java.util.Scanner;

import com.dxc.Dao.EmployeeDao;
import com.dxc.Dao.EmployeeDaoImpl;
import com.dxc.EmployeeManagementSystem.Employee;

public class ClientDemo {
	public static void main(String[] args)
	{
		EmployeeDao dao = new EmployeeDaoImpl();
		int emp1 = dao.saveEmployee("name",23,30000);
		int n = 1;
		Scanner sc = new Scanner(System.in);
		while(n==1) {
		System.out.println("---------- OPTIONS -----------");
		System.out.println("1. Save Employee");
		System.out.println("2. Get All Employees");
		System.out.println("3. Update Employee");
		System.out.println("4. Delete Employee");
		System.out.println("5. Exit");
		System.out.println("Enter your choice (1-5)");
		
		int choice = sc.nextInt();
		
		switch(choice) {
			case 1: 
				int emp2 = dao.saveEmployee("name",22,40000);
				int emp3 = dao.saveEmployee("name",24,55000);
				int emp4 = dao.saveEmployee("name",23,45000);
				break;
			
			case 2:
				List<Employee> emps1 = dao.getEmployee();
				for(Employee e : emps1) {
					System.out.println(e);
				}
				
				break;
				
			case 3:
				dao.updateEmployee(emp1, 29533);
			
				List<Employee> emps2 = dao.getEmployee();
				for(Employee e : emps2) {
					System.out.println(e);
				}
				break;
				
			case 4:
				dao.deleteEmployee(emp1);
				
				List<Employee> emps3 = dao.getEmployee();
				for(Employee e : emps3) {
					System.out.println(e);
					}
				break;
			
			case 5:
				System.out.println("Successfully got exited");
				
				break;
				
			default:
				System.out.println("Wrong option selected");
			}
			System.out.println("Do u want continue");	
			n = sc.nextInt();
		}
	}
	}
