package com.evergent.corejava.studentapplication;

import com.evergent.corejava.bookapplication.BookBean;
import com.evergent.corejava.bookapplication.BookDAO;

public class StudentService {
     
	public int addBookService(int studentid,String studentname,int marks1)
	{  String grade="";
	
	   if(marks1<=70)
	   {
		   grade = "C";
	   }
	   else if(marks1<=80)
	   {
		   grade = "B";
		   
	   }
	   else
	   {
		   grade = "A";
	   }
		
		
		StudentDAO bookDAO = new StudentDAO();
		StudentBean bookBean=new StudentBean();
	       bookBean.setstudentid(studentid);	
	       bookBean.setstudentname(studentname);
	       bookBean.setmarks1(marks1);
	       bookBean.setGrade(grade);
	
		   int updateResult= bookDAO.addBook(bookBean);
		
		return 1;
	} 
}
