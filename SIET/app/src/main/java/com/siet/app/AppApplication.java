package com.siet.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AppApplication {

	public static void main(String[] args) {
		System.out.print("Sistema para el Inventario de Elementos Tecnologicos");
		SpringApplication.run(AppApplication.class, args);
	}

}
