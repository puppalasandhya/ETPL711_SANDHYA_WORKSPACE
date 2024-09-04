package com.evergent.corejava.studentapplication;
import java.io.Serializable;

public class StudentBean implements Serializable {
	private String title;
	private int marks1;
	private String grade;
	private int bookId;
	
	private int studentid;
	private String studentname;
	private int marks;
	
	public void setstudentid(int studentid) {
		this.studentid = studentid;
	}
	
	public int getstudentid() {
		return studentid;
	}
	
	public void setstudentname(String studentname) {
		this.studentname = studentname;
	}
	
	public String getstudentname() {
		return studentname;
	}
	
	   

	public int getmarks() {
		return marks1;
	}
	public void setmarks1(int marks1) {
		this.marks1 = marks1;
	}
	
	
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	
	
	
	
}
