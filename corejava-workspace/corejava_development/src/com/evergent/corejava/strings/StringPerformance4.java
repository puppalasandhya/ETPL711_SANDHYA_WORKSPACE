package com.evergent.corejava.strings;

public class StringPerformance4 {

	public static void main(String[] args) {
		StringBuilder sb=new StringBuilder();
		for(int i=0;i<26;i++)
		{
			char ch=(char)('a'+i);
			sb.append(ch);
			
		}
		System.out.println(sb);
    // System.out.println(sb.toString());
	}

}
