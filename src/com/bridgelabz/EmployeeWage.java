package com.bridgelabz;

public class EmployeeWage {
	static final int WAGE_PER_HOUR = 20;
	static final int FULL_PER_HOUR = 8;
	static final int PART_PER_HOUR = 4;
	static final int IS_FULL_TIME = 2;
	static final int IS_PART_TIME = 1;
	static final int WORKING_DAY_PER_MONTH = 20;
	
	public static void main(String[] arg) {
		int day =1;
		int totalWage =0;
	while (day<=WORKING_DAY_PER_MONTH)	{
		int dailyWage =0;
		int employeeAttendance=(int)Math.floor(Math.random()*10)%3;
			
	switch (employeeAttendance)
	{
		case IS_FULL_TIME :
			System.out.println("Employee is full time");
			dailyWage= WAGE_PER_HOUR*FULL_PER_HOUR;
			break;
		case IS_PART_TIME:
			System.out.println("Employee is part time");
			dailyWage= WAGE_PER_HOUR*PART_PER_HOUR;
			break;
		default:
			System.out.println("Employee is absent");
		}
	totalWage=totalWage + dailyWage;
	System.out.println("Daily Wage for=>" + day + "day =>" + dailyWage);
	day++;
	}
	System.out.println("Total Wage =>" + totalWage);
	}
}






