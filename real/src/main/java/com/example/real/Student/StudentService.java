package com.example.real.Student;

import org.springframework.web.bind.annotation.GetMapping;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

public class StudentService {
    @GetMapping
    public List<Student> getStudent(){
        return List.of(
                new Student(
                        1L,
                        "Jerry",
                        "jerry.manJ@gmail.com",
                        LocalDate.of(2000, Month.AUGUST,5),
                        21
                )
        );
    }
}
