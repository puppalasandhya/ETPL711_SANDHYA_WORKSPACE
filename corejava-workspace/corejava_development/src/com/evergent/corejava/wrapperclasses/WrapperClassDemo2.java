package com.evergent.corejava.wrapperclasses;

public class WrapperClassDemo2 {

	public static void main(String[] args) {
		float f1=4.5f;
		Float f2=new Float(f1);
		
		float f3=f2.floatValue();
		
        double d1=799.89;
        Double d2=new Double(d1);
        double d3=d2.doubleValue();
        
        byte b1=10;
        Byte b2=new Byte(b1);
        byte b3=b2.byteValue();
        
        //float value
        System.out.println("float value"+f1);
        System.out.println("float object value "+f2);
        System.out.println("convert float object value to primitive type:"+f3);
        
        //double value
        System.out.println("Double value"+d1);
        System.out.println("Double object value "+d2);
        System.out.println("convert double object value to primitive type:"+d3);
        
      //Byte value
        System.out.println("Byte value"+b1);
        System.out.println("Byte object value "+b2);
        System.out.println("convert Byte object value to primitive type:"+b3);
        
        
	}

}
