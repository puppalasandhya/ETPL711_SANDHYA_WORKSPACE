//Implementation class
package com.evergent.corejava.abstract1;

public class ProductImpl1  extends Product {
        public void newProducts()
        {
        	//Implementation of abstarct method
        	System.out.println("My new Product");
        }
        public void show()
        {
        	System.out.println("Local methods of ProductImpl1 class");
        }
        public static void main(String args[])
        {
        	ProductImpl1 p1=new ProductImpl1();
        	p1.show();
        	p1.newProducts();
        }
}
