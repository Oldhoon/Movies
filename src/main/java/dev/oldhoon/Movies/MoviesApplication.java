package dev.oldhoon.Movies;

import org.springframework.boot.SpringApplication; //contains run method
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication // annotation
public class MoviesApplication {

	public static void main(String[] args) {
		SpringApplication.run(MoviesApplication.class, args);
	}
}