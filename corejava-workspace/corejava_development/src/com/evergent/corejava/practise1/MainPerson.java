package com.evergent.corejava.practise1;

class PersonImmutable{
	private final String name;
	private final int age;
	
	PersonImmutable(String name,int age)
	{
		this.name=name;
		this.age=age;
	}
//	public String myName()
//	{
//		return name;
//	}
//	public int myAge()
//	{
//		return age;
//	}
	public void display()
	{
		System.out.println("Name :"+name);
		System.out.println("age :"+age);
	}
}

public class MainPerson {

	public static void main(String[] args) {
		
		PersonImmutable  person=new PersonImmutable("raj",30);
//		System.out.println(person.myName());
//		System.out.println(person.myAge());
		person.display();
	}

}
