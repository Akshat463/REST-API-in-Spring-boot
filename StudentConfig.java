package com.example.apiapplicationNEW.student;

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
            Student akshat = new Student(
                    1L,
                    "Akshat",
                    "akshat@gmail.com",
                    LocalDate.of(2003, Month.JULY, 4),
                    21
            );
            Student alex = new Student(
                    "alex",
                    "alex@gmail.com",
                    LocalDate.of(2003, Month.JANUARY, 14),
                    21
            );
            repository.saveAll(
                    List.of(akshat,alex)
            );
        };
    }

}
