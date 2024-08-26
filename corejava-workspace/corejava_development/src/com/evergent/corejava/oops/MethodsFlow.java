package com.evergent.corejava.oops;

public class MethodsFlow {
	//no arguments with no return type
	public void display()
	{
		System.out.println("Display Methods:hello:");
		System.out.println("no arguments with no return type");
	}
	//Arguments with no return type
	public void add(int a,int b)
	{
		System.out.println(a+b);
	}
	// Arguments with return type
	public int myData(int a,int b)
	{
		return (a*b);
	}
	//no arguments with  return type
	public int myChange()
	{
		return 100;
	}
	public static void main(String args[])
	{
		MethodsFlow mf=new MethodsFlow();
		mf.display();
		
		mf.add(5, 15);
		
		int t=mf.myData(5, 5);
		System.out.println(t);
		
		int k=mf.myChange();
		System.out.println(k);
	}

}
