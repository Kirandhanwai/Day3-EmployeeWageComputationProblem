package com.bridgelabz;

public class EmployeeWage {
	
	public static void main(String[] arg) {
		int employeeAttendance=(int)Math.round(Math.random());
			System.out.println(employeeAttendance);
		if (employeeAttendance == 1) {
			System.out.println("Employee is Present");
		}
		else {
			System.out.println("Employee is Absent");
		}
	}
}
