package com.employee;

public class EmployeeBuilderUC {

	public static void main(String[] args) {
		final int isPart_time=0;
		final int isFull_time=1;

		//variables
		int rateperHour=20;
		int working_days=10;
		int empHours=0, empwage = 0;
		int month = 10;
		int total_working_days = 0, total_emphrs = 0;
while (total_emphrs < month && total_working_days < working_days) {
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
		empwage=empHours * rateperHour;
		total_emphrs+=empwage;
		System.out.println("Employee's Salary: "+empwage);
		System.out.println("Employee's total Salary: "+total_emphrs);
		
}}}