//Write a java Program to create a string,
//remove all spaces from the string and then print out the result. 
package com.evergent.corejava.strings;
 

public class RemovesSpaces {

	public static void main(String[] args) {
		String str="Hello worls,this is a test";
		String nospaces=str.replace(" ","");
		System.out.println(nospaces);

	}

}
