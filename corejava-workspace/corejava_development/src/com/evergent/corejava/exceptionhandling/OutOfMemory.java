package com.evergent.corejava.exceptionhandling;

public class OutOfMemory {

	public static void main(String[] args) {
		Integer[] array=new Integer[100000000 * 100000000];
		System.out.println(array);

	}

}
