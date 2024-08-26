package com.evergent.corejava.wrapperclasses;

public class WrapperClassDemo1 {

	public static void main(String[] args) {
		//Auto-Boxing
		int a=10;
		Integer i1=new Integer(a);
		System.out.println(i1);
		
		//Auto-Unboxing
		int a1=i1.intValue();
		System.out.println(a1);

	}

}
