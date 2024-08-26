package com.evergent.corejava.stringsImmutable;

public class PersonImmutable {

	private final  String name;
	private final int age;
	PersonImmutable(String name,int age)
	{
		this.name=name;
		this.age=age;
	}
	public String myName()
	{
		return name;
	}
	public int myAge()
	{
		return age;
	}
}






