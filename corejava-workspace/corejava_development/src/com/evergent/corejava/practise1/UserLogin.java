package com.evergent.corejava.practise1;

public class UserLogin {
	public void logindetails()
	{
		System.out.println("login details");
	}
	public void logindetails(String str1,String str2)
	{
		System.out.println("str1 is :"+str1);
		System.out.println("str2 is :"+str2);
	}
	public void logindetails(String s1,int n)
	{
		System.out.println("s1 is :"+s1);
		System.out.println("integer is :"+n);
	}
	public static void main(String args[])
	{
		UserLogin u1=new UserLogin();
		u1.logindetails("raj","raj123");
		u1.logindetails("abc",11);
	}

}
