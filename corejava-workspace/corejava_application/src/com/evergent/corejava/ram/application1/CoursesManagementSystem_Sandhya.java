//package com.evergent.corejava.ram.application1;
//import java.io.IOException;
//import java.util.Scanner;
//
//import com.evergent.corejava.ram.application1.EventManagementSystem_RAM.menucode;
//
//public class CoursesManagementSystem_Sandhya {
//	
//	
//	enum module1 {Courses,Services,Payment,Exit};
//	enum submodule1 {Fullstack,Dbms,Mernstack};
//	
//	enum submodule2  {Call,Mail,Instagram};
//	enum submodule3  {Invoice,Summary,payamount};
//	enum submodule1_1 {JavaFullstack,PythonFullstack,DotNetstack};
//	enum submodule1_2 {Rdbms,Nosqldbms,Networkdbms};
//	enum submodule1_3 {Mongodb,nodejs};
//	static int itemcost;
//	static int amount;
//	static int pieces;
//	static int amountdisc;
//
//	public static void main(String[] args)  throws IOException{
//		String module = null;
//		
//		  Scanner br =new Scanner(System.in);
//		  System.out.println("\n\t\t \t\t Welcome To Institution  Courses");
//		  
//		  while(true)
//		  {
//
//		  
//		  System.out.println("-------------------------");
//		  System.out.println("!!!!!!INSTITUTION COURSES !!!!!!");
//		  System.out.println("-----------------------------");
//		  System.out.println("Courses-courses module");
//		  System.out.println("Services-services module");
//		  System.out.println("Payment-Payment Module");
//		  System.out.println("Exit-Quit Module");
//		  System.out.println("-----------------------------");
//		  System.out.println("Enter your Module name (Courses,Services,Payment,Exit) : ");
//		   module=br.nextLine();
//		System.out.println("You entered module is  : " );
//		
//		switch(module1.valueOf(module))
//		{
//		case Courses:
//		System.out.println(" Course names");
//		System.out.println("-------------------------");
//		System.out.println("Fullstack");
//		System.out.println("Dbms");
//		System.out.println("Mernstack");
//		System.out.println("------------------------------");
//		System.out.println("Enter your Module name (Fullstack,Dbms,Mernstack) : ");
//		module=br.nextLine();
//		switch(submodule1.valueOf(module))
//		{
//		case Fullstack:
//
//		 System.out.println("------------------------");
//		System.out.println("JavaFullstack");
//		System.out.println("PythonFullstack");
//		System.out.println("DotNetstack");
//		System.out.println("------------------------------");
//		System.out.println("Enter your Module name (JavaFullstack,PythonFullstack,DotNetstack) : ");
//		module=br.nextLine();
//		switch(submodule1_1.valueOf(module))
//		{
//		 case JavaFullstack:
//		 itemcost=10000;
//		 break;
//		 case PythonFullstack:
//		 itemcost=15000;
//		 break;
//		  case DotNetstack:
//		 itemcost=16000;
//		 break;
//		 
//		    }
//		break;
//		 case Dbms:
//
//			 System.out.println("------------------------");
//			 System.out.println("Rdbms");
//			 System.out.println("Nosqldbms");
//			 System.out.println("Networkdbms");
//			 System.out.println("------------------------------");
//			 System.out.println("Enter your Module name (Rdbms,Nosql,Networkdbms) : ");
//			 module=br.nextLine();
//			 
//			 
//			 switch(submodule1_2.valueOf(module))
//			 {
//			  case Rdbms:
//			  itemcost=40000;
//			  break;
//			  case Nosqldbms:
//			  itemcost=50000;
//			  break;
//			  case Networkdbms:
//			  itemcost=44000;
//			  break;
//			     }
//			 break;
//			 
//		    case Mernstack:
//		    	   
//		        System.out.println("------------------------");
//		        System.out.println("Mongodb");
//		        System.out.println("nodejs");
//		        System.out.println("------------------------------");
//		        System.out.println("Enter your Module name (Mongodb,nodejs) : ");
//		        module=br.nextLine();
//		        
//		        switch(submodule1_3.valueOf(module))
//		        {
//		         case Mongodb:
//		         itemcost=25000;
//		         break;
//		         case nodejs:
//		         itemcost=30000;
//		         break;
//		         
//		          }
//		    break;
//		    }
//    
//		
//		System.out.println("Enter the number of students");
//		pieces =Integer.parseInt( br.nextLine());
//		
//		System.out.println("you selected no of students are "+pieces);
//		amount=itemcost*pieces;
//		System.out.println("Amount for courses before discount is Rs"+amount);
//		if(amount >= 20000 && amount <=30000)
//		amountdisc=(int) (amount-(amount*0.02));
//		if(amount >= 30000 && amount<=50000)
//		amountdisc=(int) (amount-(amount*0.05));
//		else if(amount >= 51000 && amount <=100000)
//		amountdisc=(int) ((amount-amount*0.06));
//		else if(amount >= 150000)
//		amountdisc=(int) ((amount-amount*0.08));
//
//		System.out.println("Amount for courses after Discount for selected pieces is  Rs"+amountdisc);
//       break;
//       
//       
//		case Services:
//			System.out.println("-------------------");
//			System.out.println("Call");
//			System.out.println("Mail");
//			System.out.println("Instagram");
//
//			System.out.println("------------------------------");
//			System.out.println("Enter your Module name (Call,Mail,Instagram) : ");
//			module=br.nextLine();
//			switch(submodule2.valueOf(module))
//			{
//			case Call:
//			System.out.println("phone number:7036635645");
//			   break;
//			case Mail:
//			System.out.println("mail address:puppalasandhya77@gmail.com");
//			break;
//			case Instagram:
//			System.out.println("Instagram id:sandhya77");
//			break;
//			}
//			 break;
//			 
//		case Payment:
//			System.out.println(" Payment Module");
//			System.out.println("------------------------");
//			System.out.println("invoice");
//			System.out.println("summary");
//			System.out.println("payamount");
//			System.out.println("---------------------------");
//			System.out.println("Enter your Module code (Invoice,Summary,payamount) : ");
//			module=br.nextLine();
//			switch(submodule3.valueOf(module))
//			{
//			case Invoice:
//			System.out.println("Invoice Display");
//			System.out.println("==================");
//			System.out.println("Ordered Id : " +(Math.ceil(Math.random())));
//			System.out.println("you selected no of students are "+pieces);
//			System.out.println("To Make Payment : Rs"+amount);
//			break;
//			
//			case Summary:
//			System.out.println("Summary Of Order");
//			System.out.println("======================");
//			System.out.println("you selected courses item cost Rs"+amount);
//			System.out.println("you selected no of pieces are "+pieces);
//			System.out.println("Amount for taken courses after Discount for selected students is  Rs"+amountdisc);
//			System.out.println("\n");
//			System.out.println("Total Amount to be Paid : Rs"+amount);
//			System.out.println("To Make Payment : Rs"+amountdisc);
//			break;
//			
//			case payamount:
//				
//			System.out.println("total payamount"+amountdisc);
//			break;
//			}
//
//			break;
//			case Exit:
//			System.out.println("Thank you");
//			System.exit(0);
//			break;
//			 
//			}
//
//
//			}
//			}
//}
package com.evergent.corejava.ram.application1;
import java.io.IOException;
import java.util.Scanner;

import com.evergent.corejava.ram.application1.EventManagementSystem_RAM.menucode;

public class CoursesManagementSystem_Sandhya {
	
	
	enum module1 {s1,s2,s3,s4};
	enum submodule1 {s11,s12,s13};
	
	enum submodule2  {s21,s22,s23};
	enum submodule3  {s31,s32,s33};
	enum submodule1_1 {s111,s112,s113};
	enum submodule1_2 {s121,s122,s123};
	enum submodule1_3 {s131,s132};
	static int itemcost;
	static int amount;
	static int pieces;
	static int amountdisc;

	public static void main(String[] args)  throws IOException{
		String module = null;
		
		  Scanner br =new Scanner(System.in);
		  System.out.println("\n\t\t \t\t Welcome To Institution  Courses");
		  
		  while(true)
		  {

		  
		  System.out.println("-------------------------");
		  System.out.println("!!!!!!INSTITUTION COURSES !!!!!!");
		  System.out.println("-----------------------------");
		  System.out.println("s1-courses module");
		  System.out.println("s2-services module");
		  System.out.println("s3-Payment Module");
		  System.out.println("s4-Quit Module");
		  System.out.println("-----------------------------");
		  System.out.println("Enter your Module name (s1,s2,s3,s4) : ");
		   module=br.nextLine();
		System.out.println("You entered module is  : " );
		
		switch(module1.valueOf(module))
		{
		case s1:
		System.out.println(" Course names");
		System.out.println("-------------------------");
		System.out.println("s11-Fullstack");
		System.out.println("s12-Dbms");
		System.out.println("s13-Mernstack");
		System.out.println("------------------------------");
		System.out.println("Enter your Module name (s11,s12,s13 : ");
		module=br.nextLine();
		switch(submodule1.valueOf(module))
		{
		case s11:

		 System.out.println("------------------------");
		System.out.println("s111-JavaFullstack");
		System.out.println("s112-PythonFullstack");
		System.out.println("s113-DotNetstack");
		System.out.println("------------------------------");
		System.out.println("Enter your Module name (s111,s112,s113) : ");
		module=br.nextLine();
		switch(submodule1_1.valueOf(module))
		{
		 case s111:
		 itemcost=10000;
		 break;
		 case s112:
		 itemcost=15000;
		 break;
		  case s113:
		 itemcost=16000;
		 break;
		 
		    }
		break;
		 case s12:

			 System.out.println("------------------------");
			 System.out.println("s121-Rdbms");
			 System.out.println("s122-Nosqldbms");
			 System.out.println("s123-Networkdbms");
			 System.out.println("------------------------------");
			 System.out.println("Enter your Module name (s121,s122,s123) : ");
			 module=br.nextLine();
			 
			 
			 switch(submodule1_2.valueOf(module))
			 {
			  case s121:
			  itemcost=40000;
			  break;
			  case s122:
			  itemcost=50000;
			  break;
			  case s123:
			  itemcost=44000;
			  break;
			     }
			 break;
			 
		    case s13:
		    	   
		        System.out.println("------------------------");
		        System.out.println("s131-Mongodb");
		        System.out.println("s132-nodejs");
		        System.out.println("------------------------------");
		        System.out.println("Enter your Module name (s131,s132) : ");
		        module=br.nextLine();
		        
		        switch(submodule1_3.valueOf(module))
		        {
		         case s131:
		         itemcost=25000;
		         break;
		         case s132:
		         itemcost=30000;
		         break;
		         
		          }
		    break;
		    }
    
		
		System.out.println("Enter the number of students");
		pieces =Integer.parseInt( br.nextLine());
		
		System.out.println("you selected no of students are "+pieces);
		amount=itemcost*pieces;
		System.out.println("Amount for courses before discount is Rs"+amount);
		if(amount >= 20000 && amount <=30000)
		amountdisc=(int) (amount-(amount*0.02));
		if(amount >= 30000 && amount<=50000)
		amountdisc=(int) (amount-(amount*0.05));
		else if(amount >= 51000 && amount <=100000)
		amountdisc=(int) ((amount-amount*0.06));
		else if(amount >= 150000)
		amountdisc=(int) ((amount-amount*0.08));

		System.out.println("Amount for courses after Discount for selected pieces is  Rs"+amountdisc);
       break;
       
       
		case s2:
			System.out.println("-------------------");
			System.out.println("s21-Call");
			System.out.println("s22-Mail");
			System.out.println("s23-Instagram");

			System.out.println("------------------------------");
			System.out.println("Enter your Module name (s21,s22,s23) : ");
			module=br.nextLine();
			switch(submodule2.valueOf(module))
			{
			case s21:
			System.out.println("phone number:7036635645");
			   break;
			case s22:
			System.out.println("mail address:puppalasandhya77@gmail.com");
			break;
			case s23:
			System.out.println("Instagram id:sandhya77");
			break;
			}
			 break;
			 
		case s3:
			System.out.println(" Payment Module");
			System.out.println("------------------------");
			System.out.println("s31-invoice");
			System.out.println("s32-summary");
			System.out.println("s33-payamount");
			System.out.println("---------------------------");
			System.out.println("Enter your Module code (s31,s32,s33) : ");
			module=br.nextLine();
			switch(submodule3.valueOf(module))
			{
			case s31:
			System.out.println("Invoice Display");
			System.out.println("==================");
			System.out.println("Ordered Id : " +(Math.ceil(Math.random())));
			System.out.println("you selected no of students are "+pieces);
			System.out.println("To Make Payment : Rs"+amount);
			break;
			
			case s32:
			System.out.println("Summary Of Order");
			System.out.println("======================");
			System.out.println("you selected courses item cost Rs"+amount);
			System.out.println("you selected no of pieces are "+pieces);
			System.out.println("Amount for taken courses after Discount for selected students is  Rs"+amountdisc);
			System.out.println("\n");
			System.out.println("Total Amount to be Paid : Rs"+amount);
			System.out.println("To Make Payment : Rs"+amountdisc);
			break;
			
			case s33:
				
			System.out.println("total payamount"+amountdisc);
			break;
			}

			break;
			case s4:
			System.out.println("Thank you");
			System.exit(0);
			break;
			 
			}


			}
			}
}




