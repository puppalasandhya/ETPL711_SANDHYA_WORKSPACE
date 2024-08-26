package com.evergent.corejava.strings;

public class StringBuilderExample {

	public static void main(String[] args) {
	   StringBuilder sb=new StringBuilder("Hello");
	   System.out.println("Initial String:"+sb);
	   
	   sb.append(" World");
	   System.out.println("after appending:"+sb);
	   
	   sb.insert(6, "Beautiful ");
	   System.out.println("After inserting :"+sb);
	   
	   sb.replace(0,5,"Hi");
	   System.out.println("After replacing:"+sb);
	   
	   sb.delete(0, 3);
	   System.out.println("After deleting :"+sb);
	   
	   sb.reverse();
	   System.out.println("After reversing :"+sb);

	}

}
