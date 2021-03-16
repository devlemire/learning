package com.example.learning.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository studentRepository) {
        return args -> {
            Student james = new Student(
                    "James",
                    LocalDate.of(1997, 3, 26),
                    "a@gmail.com"
            );

            Student jessica = new Student(
                    "Jessica",
                    LocalDate.of(1999, 4, 27),
                    "b@gmail.com"
            );

            studentRepository.saveAll(List.of(james, jessica));
        };
    }
}
