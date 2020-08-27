/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.springrest.springrest.services;

import com.springrest.springrest.entities.Course;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.stereotype.Service;

/**
 *
 * @author ubuntu
 */

@Service
public class CourseServiceImpl implements CourseService{
    
    List<Course> list;
    public CourseServiceImpl(){
        list=new ArrayList<>();
        list.add(new Course(123,"java course","contains basics of java"));
        list.add(new Course(129,"spring boot","contains basics of spring"));
    }

    @Override
    public List<Course> getCourses() {
      
        return list;
    }

    @Override
    public Course getCourse(long courseId) {
      
        Course c=null;
        for(Course course:list)
        {
            if(course.getId()==courseId)
            {
                c=course;
                break;
            }
        }
               return c;
      }

    @Override
    public Course addCourse(Course course) {
       
        list.add(course);
        return course;
    }

    @Override
    public Course updateCourse(Course course) {
      list.forEach(e ->{
          if(e.getId()==course.getId()){
              e.setTitle(course.getTitle());
              e.setDescription(course.getDescription());
          }
      }
      
      );
        return course;
    }

    @Override
    public void deleteCourse(long parseLong) {
      list=this.list.stream().filter(e->e.getId()!=parseLong).collect(Collectors.toList());
        
    }

   
    
}
