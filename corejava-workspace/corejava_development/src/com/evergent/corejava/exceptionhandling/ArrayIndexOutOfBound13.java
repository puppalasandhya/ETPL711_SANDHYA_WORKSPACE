package com.evergent.corejava.exceptionhandling;

public class ArrayIndexOutOfBound13 {

	public static void main(String[] args) {
	 int[] number= {1,2,3,4,5};
	 try {
		 System.out.println("get the number at index 10:"+number[10]);
	 }
	 catch(ArrayIndexOutOfBoundsException e)
	 {
		 System.out.println("caught at the index:"+e.getMessage());
	 }
	 System.out.println("program continues after the execution");

	}

}
