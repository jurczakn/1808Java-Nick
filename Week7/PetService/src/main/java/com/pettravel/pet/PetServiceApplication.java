package com.pettravel.pet;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PetServiceApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(PetServiceApplication.class, args);
	}

	@Override
	public void run(String... arg0) throws Exception {
		
	}
}
