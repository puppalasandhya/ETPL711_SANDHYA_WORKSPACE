//this is a program to immute the class
//PersonImmutable and this combinely we did 
package com.evergent.corejava.stringsImmutable;

public class MainPerson {

	
	public static void main(String[] args) {
		PersonImmutable person=new PersonImmutable("Raj",30);
		System.out.println("Name:"+person.myName());
		System.out.println("Age:"+person.myAge());
		
	}
}
