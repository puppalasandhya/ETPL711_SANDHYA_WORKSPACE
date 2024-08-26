package com.evergent.corejava.practise1;

class Animal{
	private String name;
	private int age;
	Animal(String name,int age)
	{
		this.name=name;
		this.age=age;
	}
	public void display()
	{
		System.out.println("Name: "+name);
		System.out.println("age: "+age);
	}
}
class Dog extends Animal{
	private String breed;
	public Dog(String name,int age,String breed)
	{
		super(name,age);
		this.breed=breed;
	}
	public void display()
	{
		super.display();
		System.out.println("Breed :"+breed);
	}
}

public class Inheritance_overriding {
	   public static void main(String args[])
       {
    	   Dog d=new Dog("buddy",5,"golden");
    	   d.display();
       }
}
