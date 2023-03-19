package com.greatlearning.oops.department;

public class HrDepartment extends SuperDepartment {
	
	public HrDepartment() {
		//super();
		System.out.println("Welcome to HR Department");
	}
	public String departmentName() {
		return "Hr Department";
	}
	public String getTodaysWork() {
		return "Fill today's timesheet and mark your attendance";
	}
	public String getWorkDeadline() {
		return "Complete by EOD ";
	}
	public String doActivity() {
		return "team lunch";
	}

}
