//Java program to reverse a sring.
package com.evergent.corejava.strings;

public class ReverseString {

	public static void main(String[] args) {
		String str="Hello World";
		StringBuilder sb=new StringBuilder(str).reverse();
		System.out.println("reversed string is:"+sb);

	}

}
