package com.evergent.corejava.practise1;
class MyEmployee{
	private int eno;
	public MyEmployee()
	{
		
	}
	MyEmployee(int eno)
	{
		this.eno=eno;
		System.out.println("Employee no of super class is"+eno);
	}
}

public class Employee6 extends MyEmployee{
	private String ename;
	private double esal;
	int eno;
	Employee6()
	{
		System.out.println("default constructor");
	}
	Employee6(int eno,String ename,double esal)
	{
		super(eno);
		this.ename=ename;
		this.esal=esal;
	}
	public void display()
	{
		System.out.println(ename);
		System.out.println(esal);
	}
	public static void main(String args[]) {
		Employee6 emp=new Employee6(123,"raj",5000);
		emp.display();
	}
}
