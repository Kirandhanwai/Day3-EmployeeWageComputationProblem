package com.bridgelabz;

class EmployeeWage {
	static final int WAGE_PER_HOUR = 20;
	static final int FULL_TIME_HOUR = 12;
	static final int PART_TIME_HOUR = 6;
	static final int IS_FULL_TIME = 2;
	static final int IS_PART_TIME = 1;
	static final int WORKING_DAY_PER_MONTH = 20;
	static final int WORKING_HOURS_PER_MONTH = 100;
	
	public static int empCheck() {
		int employeeAttendance=(int)Math.floor(Math.random()*10)%3;
		return employeeAttendance;
	    }
	
	public static int empHours(int empCheck) {
		int empHours;
		switch (empCheck) {
		case IS_FULL_TIME -> empHours = FULL_TIME_HOUR;
		case IS_PART_TIME -> empHours = PART_TIME_HOUR;
		default -> empHours = 0;
		}
		return empHours;
	    }
	
	public static int empWage(int empHours) {
		int empWage = empHours * WAGE_PER_HOUR;
		return empWage;
	    }
	
	  public static int totalEmpSalary() {
			int day = 1;
			int totalEmpSalary = 0;
			int empHours = 0;
			int empWage = 0;
			int empCheck = 0;
			int totalempHours = 0;
			while (day <= WORKING_DAY_PER_MONTH && totalempHours < WORKING_HOURS_PER_MONTH) {
			    empCheck = empCheck();
			    if (empCheck == 0) {
			    	System.out.println("Employee is absent");
			    }
			    else if (empCheck == 1) {
			    	System.out.println("Employee is part time");
			    }
			    else {
			    	System.out.println("Employee is full time");
			    }
			    empHours = empHours(empCheck);
			    empWage = empWage(empHours);
			    totalempHours += empHours;   // a += b     a = a+b
			    totalEmpSalary += empWage;
			    System.out.println("Daily Wage for day " + day + " = " + totalEmpSalary + "\n");
			    day++;
			}
			System.out.println("\nTotal working hours = " + totalempHours);
			return totalEmpSalary;
		    }
}








