package com.employee;

public class EmployeeBuilderUC {

	public static void main(String[] args) {
		int isFulltime=1;
		int fulldayHour=8;
		int isParttime=0;
		int empHours;
		int salary;
		double empCheck=Math.floor(Math.random()*10)%2;
		if(empCheck==isFulltime) {
			System.out.println("full time");

			empHours=16;
		}
		else if(empCheck==isParttime) {
			empHours=8;
			System.out.println("part time");
			salary=empHours*fulldayHour;
			System.out.println("Employee salary is  "+salary);

		}
		else
		{
			empHours=0;
			System.out.println("Employee status");
		}

	}}