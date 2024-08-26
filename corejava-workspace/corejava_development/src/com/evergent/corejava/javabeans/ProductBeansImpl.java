package com.evergent.corejava.javabeans;

public class ProductBeansImpl {

	public static void main(String[] args) {
		ProductBeans p=new ProductBeans(10,"laptop",5000);
		System.out.println("product pno is: "+p.getPno());
		System.out.println("product name is: "+p.getPname());
		System.out.println("product price is: "+p.getPrice());

	}

}
