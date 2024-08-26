package com.evergent.corejava.exceptionhandling;

public class StackOverFlowErrorExample {

	public static void main(String[] args) {
		try {
			recursivemethod();
		}
		catch(StackOverflowError e)
		{
			System.out.println("stack over flow caught:"+e.getMessage());
			
		}
	}
	public static void recursivemethod() {
		recursivemethod();    //keeps on calling
	}

}
