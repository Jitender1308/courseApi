/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.springrest.springrest.services;
 

import com.springrest.springrest.entities.Course;
import java.util.List;

/**
 *
 * @author ubuntu
 */
public interface CourseService {
  
    public List<Course> getCourses();
    public Course getCourse(long courseId);
    public Course addCourse(Course course);

    public Course updateCourse(Course course);

    public void deleteCourse(long parseLong);
}
