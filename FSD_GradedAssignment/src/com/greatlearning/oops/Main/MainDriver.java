package com.greatlearning.oops.Main;

import com.greatlearning.oops.department.*;

public class MainDriver {

	public static void main(String[] args) {
		AdminDepartment adminobject=new AdminDepartment();
		System.out.println(adminobject.getTodaysWork());
		System.out.println(adminobject.getWorkDeadline());
		System.out.println(adminobject.isTodayAHoliday());
		System.out.println();
		HrDepartment hrobject=new HrDepartment();
        System.out.println(hrobject.doActivity());
        System.out.println(hrobject.getTodaysWork());
        System.out.println(hrobject.getWorkDeadline());
        System.out.println(hrobject.isTodayAHoliday());
        System.out.println();
        TechDepartment techobject=new TechDepartment();
        System.out.println(techobject.getTodaysWork());
        System.out.println(techobject.getWorkDeadline());
        System.out.println(techobject.getStackInformation());
        System.out.println(techobject.isTodayAHoliday());
	}

}
