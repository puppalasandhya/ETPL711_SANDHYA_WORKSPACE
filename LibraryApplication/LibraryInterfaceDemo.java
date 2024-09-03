package com.evergent.corejava.casestudy;

public class LibraryInterfaceDemo {
	public static void main(String args[])
	{
		try {
			KidUser  ks=new KidUser();
			ks.registerAccount(10);
			ks.requestBook("Kids");
		}
		catch (InvalidAgeException e)
		{
            System.out.println("KidUser Registration Error: " + e.getMessage());
        } 
		catch (InvalidBookTypeException e) 
		{
            System.out.println("KidUser Request Book Error: " + e.getMessage());
        }
		try {
			AdultUser  al=new AdultUser();
			al.registerAccount(18);
			al.requestBook("Fiction");
		}
		catch (InvalidAgeException e) {
            System.out.println("AdultUser Registration Error: " + e.getMessage());
        } catch (InvalidBookTypeException e) {
            System.out.println("AdultUser Request Book Error: " + e.getMessage());
        }
		
		
	}
}