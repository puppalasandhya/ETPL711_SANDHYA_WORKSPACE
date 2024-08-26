package com.evergent.corejava.interface1;

public class BookImpl1 implements Book{
	public void bookTitle()
	{
		System.out.println("Core Java");
	}
	public void bookAuthor()
	{
		System.out.println("Oracle crop"+cName);
	}
	public void bookPrice()
	{
		System.out.println("Rs 550");
	}
	public void show()
	{
		System.out.println("Local Methods of BookImpl");
	}
	public static void main(String args[])
	{
		BookImpl1   book=new BookImpl1();
		book.bookAuthor();
		book.bookTitle();
		book.bookPrice();
		book.show();
	}
}


