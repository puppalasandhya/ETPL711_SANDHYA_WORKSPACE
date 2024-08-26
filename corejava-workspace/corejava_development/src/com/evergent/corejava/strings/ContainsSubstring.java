package com.evergent.corejava.strings;

public class ContainsSubstring {

	public static void main(String[] args) {
		String str="The Quick brown oooofox jumps over the lazy dog";
		String substr="fox";
		boolean contains=str.contains(substr);
		System.out.println("contains " + substr + " : "+contains);

	}

}
