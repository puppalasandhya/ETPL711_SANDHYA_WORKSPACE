package com.evergent.corejava.finalProject;

import java.util.List;
import com.evergent.corejava.finalProject.CourseBean;
import com.evergent.corejava.finalProject.CourseDAO;

//import com.institute.bean.CourseBean;
//import com.institute.dao.CourseDAO;

public class CourseService {
    CourseDAO courseDAO = new CourseDAO();

    public void addCourse(int courseId, String courseName, int duration, int credits) {
        CourseBean course = new CourseBean();
        course.setCourseId(courseId);
        course.setCourseName(courseName);
        course.setDuration(duration);
        course.setCredits(credits);
        courseDAO.addCourse(course);
        System.out.println("Course added successfully");
    }

    public void viewCourse(int courseId) {
        CourseBean course = courseDAO.getCourse(courseId);
        if (course != null) {
            System.out.println("Course ID: " + course.getCourseId());
            System.out.println("Course Name: " + course.getCourseName());
            System.out.println("Duration: " + course.getDuration() + " months");
            System.out.println("Credits: " + course.getCredits());
        } else {
            System.out.println("Course not found!");
        }
    }

    public void viewAllCourses() {
        List<CourseBean> courses = courseDAO.getAllCourses();
        if (courses.isEmpty()) {
            System.out.println("No courses available.");
        } else {
            for (CourseBean course : courses) {
                System.out.println(course.getCourseId() + ": " + course.getCourseName());
            }
        }
    }

    public void updateCourse(int courseId, String courseName, int duration, int credits) {
        CourseBean course = new CourseBean();
        course.setCourseId(courseId);
        course.setCourseName(courseName);
        course.setDuration(duration);
        course.setCredits(credits);
        courseDAO.updateCourse(course);
        System.out.println("Course updated successfully");
    }

    public void deleteCourse(int courseId) {
        courseDAO.deleteCourse(courseId);
        System.out.println("Course deleted successfully");
    }
}