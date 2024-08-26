package com.evergent.corejava.constructor;
//constructor does not have return type not even void also
//if we write void before the constructor it will consider it as method
public class Employee4 {
	void Employee4()
	{
		System.out.println("Default constructor");
	}

	public static void main(String[] args) {
	   
		Employee4 emp4=new Employee4();
		   emp4.Employee4();

	}

}
