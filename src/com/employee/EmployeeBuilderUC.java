package com.employee;

public class EmployeeBuilderUC {

	public static void main(String[] args) {
		final int isPart_time=0;
		final int isFull_time=1;

		//variables
		int rateperHour=20;
		int empHours=0;
		int salary=0;
		int working_Hours=20;
		int monthly_Salary=0;
		
		for(int d=1; d<=working_Hours; d++) {
			
		double empCheck=Math.floor(Math.random()*10) % 2;
		int empcheck=(int)empCheck;
		
		switch(empcheck){    
		case isFull_time:    
			empHours=8;
			break; 
		case isPart_time:    
			empHours=4;
			break; 
		default:     
			empHours=0;  
			break;
		} 
		
		salary=rateperHour*empHours;
		monthly_Salary=monthly_Salary+salary;
		}
		System.out.println("Employee Salary is "+salary);
		System.out.println("Employee Monthly Salary is "+monthly_Salary);}}
