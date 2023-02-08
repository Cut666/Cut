package com.example.hone_work3;

import com.example.hone_work3.model.Course;
import com.example.hone_work3.model.Student;
import com.example.hone_work3.repository.CourseRepository;
import com.example.hone_work3.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Set;

@SpringBootApplication
public class HoneWork3Application implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(HoneWork3Application.class, args);
    }
    @Autowired
    CourseRepository courseRepository;
    @Autowired
    StudentRepository studentRepository;
    @Override
    public void run(String... args) throws Exception {
//        Student student = new Student();
//        student.setName("thai");
//        student.setPhone("32423235");
//        student.setEmail("sfs@gmail");
//        student.setStatus("studying");
//        studentRepository.save(student);
//
//        Student student1 = new Student();
//        student1.setName("thai1");
//        student1.setPhone("12341241");
//        student1.setEmail("sfs@gmail1");
//        student1.setStatus("studying");
//        studentRepository.save(student1);
//
//        Course course = new Course();
//        course.setName("Spring");
//        course.setNumberOfLectures(4);
//        course.setStudents(Set.of(student,student1));
//        courseRepository.save(course);
//
//        Course course1 = new Course();
//        course1.setName("HTML");
//        course1.setNumberOfLectures(10);
//        course1.setStudents(Set.of(student));
//        courseRepository.save(course1);
    }
}
