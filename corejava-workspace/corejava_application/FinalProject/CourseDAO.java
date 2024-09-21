package com.evergent.corejava.finalProject;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import com.evergent.corejava.finalProject.CourseBean;

public class CourseDAO {
    public int addCourse(CourseBean course) {
        try (Connection con = DBConnection.getConnection()) {
            String query = "INSERT INTO courses (courseId, courseName, duration, credits) VALUES (?, ?, ?, ?)";
            PreparedStatement pstmt = con.prepareStatement(query);
            pstmt.setInt(1, course.getCourseId());
            pstmt.setString(2, course.getCourseName());
            pstmt.setInt(3, course.getDuration());
            pstmt.setInt(4, course.getCredits());
            return pstmt.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

    public CourseBean getCourse(int courseId) {
        try (Connection con = DBConnection.getConnection()) {
            String query = "SELECT * FROM courses WHERE courseId = ?";
            PreparedStatement pstmt = con.prepareStatement(query);
            pstmt.setInt(1, courseId);
            ResultSet rs = pstmt.executeQuery();
            if (rs.next()) {
                CourseBean course = new CourseBean();
                course.setCourseId(rs.getInt("courseId"));
                course.setCourseName(rs.getString("courseName"));
                course.setDuration(rs.getInt("duration"));
                course.setCredits(rs.getInt("credits"));
                return course;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public List<CourseBean> getAllCourses() {
        List<CourseBean> courses = new ArrayList<>();
        try (Connection con = DBConnection.getConnection()) {
            String query = "SELECT * FROM courses";
            PreparedStatement pstmt = con.prepareStatement(query);
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                CourseBean course = new CourseBean();
                course.setCourseId(rs.getInt("courseId"));
                course.setCourseName(rs.getString("courseName"));
                course.setDuration(rs.getInt("duration"));
                course.setCredits(rs.getInt("credits"));
                courses.add(course);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return courses;
    }

    public int updateCourse(CourseBean course) {
        try (Connection con = DBConnection.getConnection()) {
            String query = "UPDATE courses SET courseName = ?, duration = ?, credits = ? WHERE courseId = ?";
            PreparedStatement pstmt = con.prepareStatement(query);
            pstmt.setString(1, course.getCourseName());
            pstmt.setInt(2, course.getDuration());
            pstmt.setInt(3, course.getCredits());
            pstmt.setInt(4, course.getCourseId());
            return pstmt.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

    public int deleteCourse(int courseId) {
        try (Connection con = DBConnection.getConnection()) {
            String query = "DELETE FROM courses WHERE courseId = ?";
            PreparedStatement pstmt = con.prepareStatement(query);
            pstmt.setInt(1, courseId);
            return pstmt.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }
}