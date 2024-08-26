package com.evergent.corejava.practise1;

public class StringBuilderExample {

	public static void main(String[] args) {
		StringBuilder sb=new StringBuilder("Hello ");
		System.out.println("initial string is :"+sb);
		sb.append("world ");
		System.out.println("after append:"+sb);
		sb.insert(6, "beautiful ");
		System.out.println("after insert:"+sb);
		
		sb.replace(0,5,"Hi");
		System.out.println("after replace:"+sb);
		
		sb.delete(0, 3);
		System.out.println("after delete:"+sb);
		
		sb.reverse();
		System.out.println("after reverse:"+sb);


	}

}
 