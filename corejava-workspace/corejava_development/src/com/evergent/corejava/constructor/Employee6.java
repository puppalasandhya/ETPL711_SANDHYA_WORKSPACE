package com.evergent.corejava.constructor;
 class MyEmployee{
	 int eno;
	 MyEmployee()
	 {
		 
	 }
	 public MyEmployee(int eno)
	 {
		 System.out.println("This is super class"+eno );
	 }
 }

public class Employee6 extends MyEmployee{
	
	
	String ename;
	double esal;
	Employee6()
	{
		System.out.println("Default Constructor");
	}
	Employee6(int eno,String ename,double esal)
	{
		super(eno);
		this.eno=eno;
		this.ename=ename;
		this.esal=esal;
	}
	
	
	public void display()
	{
		System.out.println("Employee no: "+ eno);
		System.out.println("Employee name: "+ename);
		System.out.println("Employee salary: "+esal);
	}

	public static void main(String[] args) {
		Employee6 emp1=new Employee6();
		Employee6 emp2=new Employee6(123,"rgukt",50000);
		emp1.display();
		emp2.display();
	
	}
		
		
		
		

}
