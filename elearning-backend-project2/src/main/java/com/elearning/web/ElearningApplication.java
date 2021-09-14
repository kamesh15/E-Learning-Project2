package com.elearning.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.elearning.web.service.StudentService;
import com.elearning.web.service.StudentServiceImplementation;

@SpringBootApplication
public class ElearningApplication {

	public static void main(String[] args) {
		SpringApplication.run(ElearningApplication.class, args);
		
	}

}
