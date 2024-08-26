package com.evergent.corejava.oops;

public class Person {
	String name="sandhya",address="siddipet";
	int age=22;
	public void display()
	{
		System.out.println("name:"+name+ \n + "Address:"+address + "age:"+ age);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub'
		Person p=new Person();
		p.display();

	}

}
