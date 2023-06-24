package com.example.launcher;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = {"com.example"})
@EnableJpaRepositories(basePackages = {"com.example.service.db"})
@EntityScan("com.example.service.db")
public class HexagonaldemopocApplication {

	public static void main(String[] args) {
		SpringApplication.run(HexagonaldemopocApplication.class, args);
	}

}
