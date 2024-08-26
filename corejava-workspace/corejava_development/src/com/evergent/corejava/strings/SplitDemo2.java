//Java program with for each method which is better than for loop
package com.evergent.corejava.strings;

public class SplitDemo2 {

	public static void main(String[] args) {
	    String str="Java is a powerfull language";
	    String[] words=str.split(" ");
        for(String w : words)
        {
        	System.out.println(w);
        }

	}

}
