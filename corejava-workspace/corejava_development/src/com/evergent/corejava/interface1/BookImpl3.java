package com.evergent.corejava.interface1;

public class BookImpl3 implements Book,NewBook{
     public void myNewBook()
     {
    	 System.out.println("My New Book");
     }
     public void bookTitle()
 	{
 		System.out.println("Core Java");
 	}
 	public void bookAuthor() {
 		System.out.println("Oracle crop:"+cName);
 	}
 	public void bookPrice()
 	{
 		System.out.println("Rs 550");
 	}
 	public void show()
 	{
 		System.out.println("Local methods of BookImpl1");
 	}
	public void dataInfo()
 	{
		System.out.println("My data Info");
	}
   public static void main(String args[])
   {
	   BookImpl3  book=new BookImpl3();
	   book.myNewBook();
	   book.bookAuthor();
	   book.bookPrice();
	   book.bookTitle();
	   book.show();
	   book.dataInfo();
   }
}
