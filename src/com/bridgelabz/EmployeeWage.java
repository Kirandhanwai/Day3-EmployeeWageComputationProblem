package com.bridgelabz;

public class EmployeeWage {
	static final int WAGE_PER_HOUR = 20;
	static final int FULL_PER_HOUR = 8;
	static final int PART_PER_HOUR = 4;
	
	public static void main(String[] arg) {
		
		int employeeAttendance=(int)Math.floor(Math.random()*10)%3;
			System.out.println(employeeAttendance);
		int dailyWage = 0;
   	  if (employeeAttendance == 2) {
			System.out.println("Employee is full time");
			dailyWage= WAGE_PER_HOUR*FULL_PER_HOUR;
		}
	  else if  (employeeAttendance == 1) {
		 System.out.println("Employee is part time");
		 dailyWage= WAGE_PER_HOUR*PART_PER_HOUR;
		}
	  else {
		  System.out.println("Employee is absent");
	  }
   	  System.out.println("Daily Wage =>" + dailyWage);
	}
}
