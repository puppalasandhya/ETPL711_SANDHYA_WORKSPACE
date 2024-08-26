//try followed by either catch block or
//finally block.
package com.evergent.corejava.exceptionhandling;

public class ExceptionDemo6 {
	
	String name="null";
	public void myData()
	{
		try {
			System.out.println("one");
			System.out.println(name.length());
			System.out.println("End");
			
		}
		finally {
			System.out.println("finally block");
		}
	}

	public static void main(String[] args) {
	
		ExceptionDemo6 ed2=new ExceptionDemo6();
		ed2.myData();
	}

}
