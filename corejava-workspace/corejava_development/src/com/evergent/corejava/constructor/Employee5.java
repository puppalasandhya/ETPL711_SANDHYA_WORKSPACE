//This is used to call one constructor to another constructor using this keyword.
package com.evergent.corejava.constructor;

public class Employee5 {
	int eno;
	String ename;
	double esal;
	Employee5()
	{
		System.out.println("Default constructor");
	}
	Employee5(int eno)
	{
		this.eno=eno;
	}
	Employee5(int eno,String ename,double esal)
	{
		this(eno);
		this.ename=ename;
		this.esal=esal;
	}
	public void display()
	{
		System.out.println("employee eno: "+eno);
		System.out.println("employee name: "+ename);
		System.out.println("employee salary: "+esal);
	}

	public static void main(String[] args) {
		Employee5  emp1=new Employee5();
		Employee5  emp2=new Employee5(123,"sandhya",5000);
		emp1.display();
		emp2.display();
		

	}

}
