//package com.evergnet.corejava.sandhya.application4;
//
//import java.io.IOException;
//import java.util.Scanner;
//
//public class CoursesManagementSystem_Sandhya1 {
//    public static void main(String[] args) throws IOException {
//        Scanner br = new Scanner(System.in);
//        while (true) {
//            System.out.println("\n\t\t \t\t Welcome To Institution Courses");
//            System.out.println("-------------------------");
//            System.out.println("!!!!!!INSTITUTION COURSES !!!!!!");
//            System.out.println("-----------------------------");
//            System.out.println("1. Courses");
//            System.out.println("2. Services");
//            System.out.println("3. Payment");
//            System.out.println("4. Exit");
//            System.out.println("-----------------------------");
//            System.out.println("Enter your Module name (Courses, Services, Payment, Exit): ");
//            String module = br.nextLine();
//
//            if (module.equals("Courses")) {
//                System.out.println("Course names");
//                System.out.println("-------------------------");
//                System.out.println("1. Fullstack");
//                System.out.println("2. Dbms");
//                System.out.println("3. Mernstack");
//                System.out.println("------------------------------");
//                System.out.println("Enter your Course name (Fullstack, Dbms, Mernstack): ");
//                String course = br.nextLine();
//
//                CourseModule selectedCourse = null;
//                switch (course) {
//                    case "Fullstack":
//                        selectedCourse = new FullstackModule();
//                        break;
//                    case "Dbms":
//                        selectedCourse = new DbmsModule();
//                        break;
//                    case "Mernstack":
//                        selectedCourse = new MernstackModule();
//                        break;
//                    default:
//                        System.out.println("Invalid Course selected.");
//                        break;
//                }
//                if (selectedCourse != null) {
//                    selectedCourse.selectSubModule();
//                }
//            } else if (module.equals("Services")) {
//                Module services = new ServicesModule();
//                services.execute();
//            } else if (module.equals("Payment")) {
//                PaymentModule payment = new PaymentModule();
//                payment.processPayment();
//            } else if (module.equals("Exit")) {
//                System.out.println("Thank you");
//                System.exit(0);
//            } else {
//                System.out.println("Invalid Module selected.");
//            }
//        }
//    }
//}

package com.evergnet.corejava.sandhya.application4;

import java.io.IOException;
import java.util.Scanner;

public class CoursesManagementSystem_Sandhya1 {
    public static void main(String[] args) throws IOException {
        Scanner br = new Scanner(System.in);
        while (true) {
            System.out.println("\n\t\t \t\t Welcome To Institution Courses");
            System.out.println("-------------------------");
            System.out.println("!!!!!!INSTITUTION COURSES !!!!!!");
            System.out.println("-----------------------------");
            System.out.println("s1. Courses");
            System.out.println("s2. Services");
            System.out.println("s3. Payment");
            System.out.println("s4. Exit");
            System.out.println("-----------------------------");
            System.out.println("Enter your Module name (s1, s2, s3, s4): ");
            String module = br.nextLine();

            if (module.equals("s1")) {
                System.out.println("Course names");
                System.out.println("-------------------------");
                System.out.println("s11. Fullstack");
                System.out.println("s12. Dbms");
                System.out.println("s13. Mernstack");
                System.out.println("------------------------------");
                System.out.println("Enter your Course name (s11, s12, s13): ");
                String course = br.nextLine();

                CourseModule selectedCourse = null;
                switch (course) {
                    case "s11":
                        selectedCourse = new FullstackModule();
                        break;
                    case "s12":
                        selectedCourse = new DbmsModule();
                        break;
                    case "s13":
                        selectedCourse = new MernstackModule();
                        break;
                    default:
                        System.out.println("Invalid Course selected.");
                        break;
                }
                if (selectedCourse != null) {
                    selectedCourse.selectSubModule();
                }
            } else if (module.equals("s2")) {
                Module services = new ServicesModule();
                services.execute();
            } else if (module.equals("s3")) {
                PaymentModule payment = new PaymentModule();
                payment.processPayment();
            } else if (module.equals("s4")) {
                System.out.println("Thank you");
                System.exit(0);
            } else {
                System.out.println("Invalid Module selected.");
            }
        }
    }
}