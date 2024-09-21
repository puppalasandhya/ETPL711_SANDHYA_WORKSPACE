package com.evergent.corejava.finalProject;


import java.util.Scanner;
import com.evergent.corejava.finalProject.CourseService;

public class CourseController {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        CourseService courseService = new CourseService();
        int choice;
        do {
            System.out.println("------ Course Management System ------");
            System.out.println("1. Add Course");
            System.out.println("2. View Course");
            System.out.println("3. View All Courses");
            System.out.println("4. Update Course");
            System.out.println("5. Delete Course");
            System.out.println("Enter your choice: ");
            choice = s.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter Course ID: ");
                    int courseId = s.nextInt();
                    System.out.println("Enter Course Name: ");
                    String courseName = s.next();
                    System.out.println("Enter Course Duration: ");
                    int duration = s.nextInt();
                    System.out.println("Enter Course Credits: ");
                    int credits = s.nextInt();
                    courseService.addCourse(courseId, courseName, duration, credits);
                    break;
                case 2:
                    System.out.println("Enter Course ID to View: ");
                    int id = s.nextInt();
                    courseService.viewCourse(id);
                    break;
                case 3:
                    courseService.viewAllCourses();
                    break;
                case 4:
                    System.out.println("Enter Course ID to Update: ");
                    int updateId = s.nextInt();
                    System.out.println("Enter new Course Name: ");
                    String newName = s.next();
                    System.out.println("Enter new Course Duration: ");
                    int newDuration = s.nextInt();
                    System.out.println("Enter new Course Credits: ");
                    int newCredits = s.nextInt();
                    courseService.updateCourse(updateId, newName, newDuration, newCredits);
                    break;
                case 5:
                    System.out.println("Enter Course ID to Delete: ");
                    int deleteId = s.nextInt();
                    courseService.deleteCourse(deleteId);
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        } while (choice != 0);

        s.close();
    }
}
