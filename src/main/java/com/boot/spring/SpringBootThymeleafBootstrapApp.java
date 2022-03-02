package com.boot.spring;

import com.boot.spring.domain.Student;
import com.boot.spring.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootThymeleafBootstrapApp implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootThymeleafBootstrapApp.class, args);
	}

	@Autowired
	private StudentRepository studentRepository;

	@Override
	public void run(String... args) {
		studentRepository.save(new Student("Kiran", "Ramreddy", "kiran@gmail.com"));
		studentRepository.save(new Student("Manoj", "Ramreddy", "manoj@gmail.com"));
		studentRepository.save(new Student("Srinivas", "Ramreddy", "srinivas@gmail.com"));
	}

}
