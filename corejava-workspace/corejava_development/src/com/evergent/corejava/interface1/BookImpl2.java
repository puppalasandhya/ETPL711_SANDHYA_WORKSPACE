//here we cannot call the local methods 
//we can only call the Interface methods
package com.evergent.corejava.interface1;

public class BookImpl2 implements Book{
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
		System.out.println("Local methods of BookImpl2");
	}

	public static void main(String[] args) {
	  Book b2=new BookImpl2();
	  b2.bookAuthor();
	  b2.bookPrice();
	  b2.bookTitle();
	  
	}

}
