package com.employee;

public class EmployeeBuilderUC {

	public static void main(String[] args) {
		//constants
		final int isPart_time=1;
		final int isFull_time=2;

		//variables
		int rateperHour=20;
		
		int salary=0, monthly_Salary=0, total_empHours=0, total_working_days=0;
		int working_days=20;
		int hours_per_month=100;

		while(total_empHours <= hours_per_month && total_working_days <= working_days ) {
			int empHours=0;
			total_working_days++;
			double empCheck=Math.floor(Math.random()*10) % 3;
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
			total_empHours+=empHours;
			salary=rateperHour*empHours;
			monthly_Salary=monthly_Salary+salary;
		}
		System.out.println("Employee total Salary is "+total_empHours);
		System.out.println("Employee Monthly Salary is "+monthly_Salary);

	}
}
