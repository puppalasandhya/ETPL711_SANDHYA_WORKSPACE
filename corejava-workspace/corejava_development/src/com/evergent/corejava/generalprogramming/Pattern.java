package com.evergent.corejava.generalprogramming;

public class Pattern {
	public static void main(String[] args) {
		for(int i=1;i<=9;i++)
		{
			int stars=0;
			if(i<=5)
			{
				stars=i;
			}
			else
			{
				stars=(2*5)-i;
			}
			for(int j=1;j<=stars;j++)
			{
				
			   System.out.print("*");
			}
			System.out.println();
		}
	}

}
