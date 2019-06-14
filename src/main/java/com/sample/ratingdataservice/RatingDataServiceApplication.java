package com.sample.ratingdataservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import resources.RatingDataResource;

@SpringBootApplication
@ComponentScan(basePackageClasses = RatingDataResource.class)
public class RatingDataServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(RatingDataServiceApplication.class, args);
	}

}
