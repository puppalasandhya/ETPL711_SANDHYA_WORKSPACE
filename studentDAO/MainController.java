package com.evergent.corejava.studentapplication;

import java.util.Scanner;

public class MainController {

	public static void main(String[] args) {
		int studentid=0;
		String studentname="";
		int marks1=0;
		
		Scanner sin=new Scanner(System.in);
		
		System.out.println("Enter Student ID");
		studentid=sin.nextInt();
		System.out.println(("Enter student name"));
		studentname = sin.next();
		System.out.println("Enter student marks");
		marks1 = sin.nextInt();
		
		StudentService studentService = new StudentService();
		
		int updeateCount=studentService.addBookService(studentid,studentname,marks1);
		
		
		//last
		  System.out.println("Inserted :"+updeateCount+" record ram Success");
		
		
		
		
	}

}
