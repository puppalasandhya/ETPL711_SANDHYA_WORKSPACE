//this and ImmutableString program combinely 
//did for normal method of tostring method 
//in order to get the objects we will use the toString method
package com.evergent.corejava.stringsImmutable;

public class MyData {
      public static void main(String args[])
      {
    	  ImmutableString str=new  ImmutableString("Hello String world");
    	  System.out.println(str.myValue());
    	  System.out.println(str.toString());
      }
}
