package com.greatlearning.oops.department;

public class TechDepartment extends SuperDepartment {
	
	public TechDepartment() {
		//super();
		System.out.println("Welcome to TechDepartment");
	}
	public String departmentName() {
		return "Tech department";
	}
	public String getTodaysWork() {
		return "Complete coding of module 1 ";
	}
	public String getWorkDeadline() {
		return "Complete by EOD";
	}
	public String getStackInformation() {
		return "Core JAVA ";
	}

}
