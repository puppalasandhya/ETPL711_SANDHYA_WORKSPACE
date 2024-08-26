package com.evergent.corejava.collections;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo4 {

	public static void main(String[] args) {
		HashSet h=new HashSet();
		h.add(100);
		h.add("hello");
		h.add(45.5);
		h.add(100);
		System.out.println(h);
		Iterator i=h.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
	}
}
