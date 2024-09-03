package com.evergent.corejava.casestudy;

class AdultUser implements LibraryUser{
	int age;
	 String bookType;

	public void registerAccount(int Age) throws InvalidAgeException
	{
		age=Age;
		if(age>12)
		{
			System.out.println("You have successfully registered under an Adult Account");
		}
		else
		{
			throw new InvalidAgeException("Sorry, Age must be greater than 12 to register as an adult");
		}
	}
	public void requestBook(String bookType)throws InvalidBookTypeException 
	{
		if(bookType.equals("Fiction"))
		{
			System.out.println("Book Issued successfully, please return the book within 7 days");
		}
		else
		{
			throw new InvalidBookTypeException("Oops, you are allowed to take only adult Fiction books");
		}
	}

}

