package com.evergent.corejava.studentapplication;

import java.util.ArrayList;

public class StudentDAO {
	
	                       //  100  corejava 250   c
	public int addBook(StudentBean bookBean)
	{
		try{
			ArrayList bookList=new ArrayList();
			bookList.add(bookBean.getstudentid());
			bookList.add(bookBean.getstudentname());
			bookList.add(bookBean.getmarks());
			bookList.add(bookBean.getGrade());	
			
			System.out.println(bookList);
			
			System.out.println("student id :"+bookBean.getstudentid());
			System.out.println("student name :"+bookBean.getstudentname());
			System.out.println("student marks :"+bookBean.getmarks());
			System.out.println("Book Grade :"+bookBean.getGrade());
			
			return 1;
		}
		catch(Exception e)
		{
			System.out.println(e);
			return 0;
		}
	}

}
