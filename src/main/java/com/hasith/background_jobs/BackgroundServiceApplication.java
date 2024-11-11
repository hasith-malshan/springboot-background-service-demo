package com.hasith.background_jobs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class BackgroundServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(BackgroundServiceApplication.class, args);
	}

}
