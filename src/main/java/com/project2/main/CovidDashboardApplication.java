package com.project2.main;

import java.io.IOException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class CovidDashboardApplication {

	public static void main(String[] args) throws IOException, InterruptedException {
		SpringApplication.run(CovidDashboardApplication.class, args);
	}

}
