/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.q.CRC143.dao;

import com.q.CRC143.dto.Course;
import com.q.CRC143.dto.Student;
import com.q.CRC143.dto.Teacher;
import java.util.List;

/**
 *
 * @author Quinten Lambert
 */
public interface CourseDao {
    Course getCourseById(int id);
    List<Course> getAllCourses();
    Course addCourse(Course course);
    void updateCourse(Course course);
    void deleteCourseById(int id);
    
    List<Course> getCoursesForTeacher(Teacher teacher);
    List<Course> getCoursesForStudent(Student student);
}
