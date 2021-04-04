package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student arden = new Student(
                    "Arden",
                    "arden@gmail.com",
                    LocalDate.of(2020, Month.APRIL, 20)

            );

            Student emrecan = new Student(
                    "Emrecan",
                    "emrecan@gmail.com",
                    LocalDate.of(2001, Month.JANUARY, 22)
            );

            repository.saveAll(
                    List.of(arden, emrecan)
            );
        };
    }
}
