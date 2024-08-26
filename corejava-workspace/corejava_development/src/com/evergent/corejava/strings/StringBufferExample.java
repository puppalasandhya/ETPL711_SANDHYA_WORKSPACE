//Examples of string buffer methods
package com.evergent.corejava.strings;

public class StringBufferExample {

	public static void main(String[] args) {
		StringBuffer sb=new StringBuffer("Hello");
		System.out.println("Initial String :"+  sb);
		sb.append(" world!");
		System.out.println("afater append :"+ sb);
		sb.insert(6,"Beautiful ");
		System.out.println("After inserting :"+sb);
		sb.replace(0, 5, "Hi");
		System.out.println("After replacing :"+sb);
		sb.delete(0, 3);
		System.out.println("after deleting :"+sb);
		sb.reverse();
		System.out.println("After reversing :"+sb);
		System.out.println("Capacity "+ sb.capacity());
		System.out.println("length "+sb.length());

	}

}
