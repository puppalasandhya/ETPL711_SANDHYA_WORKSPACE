package com.evergent.corejava.abstract1;

public class ProductImpl3  extends Product3{
       public ProductImpl3()
       {
    	   System.out.println("Product Impl sub class constructor");
       }
       public void newProduct()
       {
    	   System.out.println("My new Product");
       }
       public void show()
       {
    	   System.out.println("local methods of product Impl3 class");
       }
       public static void main(String args[])
       {
    	   Product3 p2=new ProductImpl3();
    	   p2.allProducts();
    	   p2.newProduct();
       }
}
