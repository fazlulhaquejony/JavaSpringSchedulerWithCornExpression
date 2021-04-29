package com.fazluljony.moneytransaction;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class SchedulerManagerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SchedulerManagerApplication.class, args);
	}

}
