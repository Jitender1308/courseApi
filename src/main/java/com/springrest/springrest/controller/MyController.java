package com.springrest.springrest.controller;

import com.springrest.springrest.entities.Course;
import com.springrest.springrest.services.CourseService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    @Autowired
    private CourseService courseService;
    
    
   

    //get all courses
    @GetMapping("/courses")
    public List<Course> getCourses()
    {
      return this.courseService.getCourses();
    }
    
    
    
    //get a specific course using courseId
    @GetMapping("/courses/{courseId}")
    public Course getCourse(@PathVariable String courseId){
        
        return this.courseService.getCourse(Long.parseLong(courseId));
    }
    
    
    
    //add new course
    @PostMapping("/courses")
    public Course addCourse(@RequestBody Course course)
    {
        return this.courseService.addCourse(course);
    }
    
    
    //update course
    @PutMapping("/courses/{courseId}")
    public Course updateCourse(@RequestBody Course course)
    {
        return this.courseService.updateCourse(course);
    }
    
    
    
    //delete course
    @DeleteMapping("courses/{courseId}")
    public void deleteCourse(@PathVariable String courseId){
        this.courseService.deleteCourse(Long.parseLong(courseId));
    }
    
}
