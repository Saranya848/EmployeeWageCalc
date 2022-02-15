package com.employee;

public class EmployeeBuilderUC {

	public static void main(String[] args) {
		final int isPart_time=0;
		final int isFull_time=1;

		//variables
		int rateperHour=20;
		int empHours=0;
		int salary=0;

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
		salary=rateperHour*empHours*12;

		System.out.println("Employee's Salary: "+salary);
	}}