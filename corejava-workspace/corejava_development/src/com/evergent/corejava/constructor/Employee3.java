package com.evergent.corejava.constructor;

//this is a keyword always pointing to instance variables;

public class Employee3 {
	int eno;
	String ename;//instance variables
	double esal;
	Employee3(){
		System.out.println("Default Constructor");
	}
	Employee3(int eno,String ename,double esal)//local variables
	{
		this.eno=eno;
		this.ename=ename;
		this.esal=esal;
	}
	public void display()
	{
		System.out.println("employee no: "+eno);
		System.out.println("employee name: "+ename);
		System.out.println("employee salary:"+esal);
	}

	public static void main(String[] args) {
	    new	Employee3();
	    Employee3 emp3=new Employee3(123,"raj",55000);
	    emp3.display();
	    
          
	}

}
