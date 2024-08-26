//this code is for telling that we cannot create object to 
//abstarct class but we can create the reference
package com.evergent.corejava.abstract1;

public class ProductImpl2 extends Product{
        public void newProducts()
        {
        	System.out.println("My new Product");
        }
        public void show()
        {
        	System.out.println("Local methods of productImpl2 class");
        }
        public static void main(String args[])
        {
        	Product p2=new ProductImpl2();
        	p2.allProducts();
        	p2.newProducts();
        	//p2.show();
        
        }
}
