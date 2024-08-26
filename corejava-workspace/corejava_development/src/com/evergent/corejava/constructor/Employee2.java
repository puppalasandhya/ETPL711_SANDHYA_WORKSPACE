package com.evergent.corejava.constructor;

public class Employee2 {
	int eno;   //step 7 assigning the values
	String ename;
    double sal;
    Employee2()//step3
    {
    	System.out.println("default constructor");
    }
    Employee2(int eno1,String ename1,double sal1) //step5
    {
    	eno=eno1; //step 6
    	ename=ename1;
    	sal=sal1;
    }
    public void display() // step 9
    {
    	System.out.println("Employee No : "+eno);
    	System.out.println("Employee name : "+ename);
    	System.out.println("Employee sal : "+sal);
    }

	public static void main(String[] args) { //step1
		new Employee2();  // step2
		Employee2 emp2=new Employee2(123,"raj",5500);  //step 4
		emp2.display(); //step 8

	}//step 10

}//step 11
