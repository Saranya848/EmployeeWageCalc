package com.employee;

public class EmployeeBuilderUC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				int is_fulltime=1;
				double empCheck=Math.floor(Math.random()*10)%2;
				
				if(empCheck==is_fulltime) {
					System.out.println("Employee is Present");
				}
				else
					System.out.println("Employee is Absent");
			}

}
