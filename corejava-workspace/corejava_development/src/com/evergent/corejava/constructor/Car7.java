package com.evergent.corejava.constructor;
class Car{
	String color;
	int maxspeed;
	Car()
	{
		color="white";
		maxspeed=120;
	}
	Car(String color,int maxspeed)
	{
		this.color=color;
		this.maxspeed=maxspeed;
	}
	public void display()
	{
		System.out.println("Color: "+color);
		System.out.println("Maxspeed is: "+maxspeed);
	}
}

public class Car7 {

	public static void main(String[] args) {
		Car car1=new Car();
		Car car2=new Car("red",150);
		car1.display();
		car2.display();

	}

}
