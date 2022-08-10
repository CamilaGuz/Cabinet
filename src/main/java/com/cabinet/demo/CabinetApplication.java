package com.cabinet.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CabinetApplication {
	public static void main(String[] args) {
		SpringApplication.run(CabinetApplication.class, args);
		System.out.println("Hola mundo");
	}

}
