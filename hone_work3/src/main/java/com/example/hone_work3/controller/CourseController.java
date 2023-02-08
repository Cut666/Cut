package com.example.hone_work3.controller;

import com.example.hone_work3.model.Course;
import com.example.hone_work3.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CourseController {
    @Autowired
    CourseRepository courseRepository;

    @GetMapping("/course/all")
    public ResponseEntity<List<Course>> getAllCoures(){
        List<Course> courses = courseRepository.findAll();
        return ResponseEntity.ok(courses);
    }
    @PostMapping("/course/update")
    public ResponseEntity<String> updateCourse(@RequestParam int id,@RequestBody Course course1){
        Course course = courseRepository.findById(id).get();
        course.setNumberOfLectures(course1.getNumberOfLectures());
        courseRepository.save(course);
        return ResponseEntity.ok("sdf");
    }

    @GetMapping("/course/delete")
    public ResponseEntity<String> delete(@RequestParam int id){
        Course course = courseRepository.findById(id).get();
        courseRepository.delete(course);
        return ResponseEntity.ok("delete ok");
    }
}
