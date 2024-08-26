package com.evergent.corejava.javabeans;

public class Employeeimpl {

	public static void main(String[] args) {
		//initializing the values to java beans
		EmployeeBeans emp=new EmployeeBeans();
		emp.setEno(100);
		emp.setEname("ravi");
		emp.setEsal(5000);
		
		//retrieving the values from Java Beans
		System.out.println("employee eno: "+emp.getEno());
		System.out.println("employee ename: "+emp.getEname());
		System.out.println("employee salaray: "+emp.getEsal());
	}

}
