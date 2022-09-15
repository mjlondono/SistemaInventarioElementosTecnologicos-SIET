package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SIET_Application {

	public static void main(String[] args) {

		System.out.print("Sistema para el Inventario de Elementos Tecnologicos");
		SpringApplication.run(SIET_Application.class, args);
	}

}
