package com.example.real.Student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args -> {
            Student jerry = new Student(
                    "Jerry",
                    "jerry.manJ@gmail.com",
                    LocalDate.of(2000, Month.AUGUST,5)

            );
            Student alex = new Student(
                    "Alex",
                    "alex@gmail.com",
                    LocalDate.of(2004, Month.JANUARY,19)

            );

            repository.saveAll(
                    List.of(jerry, alex)
            );
        };
    }
}
