package com.example.main;

import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;

@SpringBootApplication(scanBasePackages = "com.example.user")
public class MainApplication {
	public static void main(String[] args) {
		SpringApplication.run(MainApplication.class,args);
	}
}
