package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.rest.webmvc.config.RepositoryRestMvcConfiguration;
@EnableJpaRepositories
@Import(RepositoryRestMvcConfiguration.class)
@SpringBootApplication
public class SpringJpaAngularApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringJpaAngularApplication.class, args);
	}
}
