//Multi level inheritance
package com.evergent.corejava.practise1;

class Multilevel {

	public void personinfo()
	{
		System.out.println("Rajesh");
	}
}
class PersonDetails extends Multilevel{
	public void personData()
	{
		System.out.println("Hyderabad");
	}
}
public class MyPerson extends PersonDetails{
	public void show()
	{
		System.out.println("Local methods");
	}
	public static void main(String args[])
	{
		MyPerson m=new MyPerson();
		m.personinfo();
		m.personData();
		m.show();
	}
}
