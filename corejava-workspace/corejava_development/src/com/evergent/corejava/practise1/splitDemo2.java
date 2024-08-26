package com.evergent.corejava.practise1;

public class splitDemo2 {

	public static void main(String[] args) {
		String str="java is a powerful programming language";
		String[] words=str.split(" ");
		for(int i=0;i<words.length;i++)
		{
			System.out.println(words[i]);
		}
     for(String w:words)
     {
    	 System.out.println(w);
     }
	}

}
