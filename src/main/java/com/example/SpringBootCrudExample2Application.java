package com.example;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.example.entity.BlogBean;
import com.example.entity.CommentBean;
import com.example.repository.BlogRepository;
import com.example.repository.CommentRepository;
@SpringBootApplication(scanBasePackages = {"com.example.repository.CommentRepository","com.example.repository.BlogRepository"})
public class SpringBootCrudExample2Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootCrudExample2Application.class, args);
	}
}