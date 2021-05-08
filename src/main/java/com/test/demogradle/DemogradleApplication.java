package com.test.demogradle;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import racingcars.models.Winner;
import racingcars.service.CalculateMaxSpeed;

import java.io.File;
import java.net.URL;

@SpringBootApplication
public class DemogradleApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemogradleApplication.class, args);

		 URL carsUrl =
		 Thread.currentThread().getContextClassLoader().getResource("Cars.csv");
		 URL teamsUrl =
		 Thread.currentThread().getContextClassLoader().getResource("Teams.csv");
		 URL partsUrl =
		 Thread.currentThread().getContextClassLoader().getResource("Parts.csv");

//		URL carsUrl = Thread.currentThread().getContextClassLoader().getResource(args[0]);
//		URL teamsUrl = Thread.currentThread().getContextClassLoader().getResource(args[1]);
//		URL partsUrl = Thread.currentThread().getContextClassLoader().getResource(args[2]);

		File carsFile = new File(carsUrl.getFile());
		File teamsFile = new File(teamsUrl.getFile());
		File partsFile = new File(partsUrl.getFile());

		CalculateMaxSpeed ca = new CalculateMaxSpeed();
		Winner a = ca.maxSpeed(carsFile, teamsFile, partsFile);
		System.out.println(a.toString());

	}

}
