package com.evergent.corejava.strings;

public class StringPerformance3 {

	public static void main(String[] args) {
		String series="";
		for(int i=0;i<26;i++)
		{
			char ch=(char)('a'+i);
			series+=ch;
		}
		System.out.println(series);

	}

}
