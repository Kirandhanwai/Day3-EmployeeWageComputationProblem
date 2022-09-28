package com.bridgelabz;

public class EmployeeWage {
	static final int WAGE_PER_HOUR = 20;
	static final int FULL_PER_HOUR = 8;
	
	public static void main(String[] arg) {
		
		int employeeAttendance=(int)Math.round(Math.random());
			System.out.println(employeeAttendance);
		int dailyWage = 0;
   	  if (employeeAttendance == 1) {
			System.out.println("Employee is Present");
			dailyWage= WAGE_PER_HOUR*FULL_PER_HOUR;
		}
	  else {
			System.out.println("Employee is Absent");
		}
   	  System.out.println("Daily Wage =>" + dailyWage);
	}
}
