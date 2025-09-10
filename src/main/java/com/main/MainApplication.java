package com.main;

import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(scanBasePackages = "com.example.core.user",exclude = {DataSourceAutoConfiguration.class })

public class MainApplication {
	public static void main(String[] args) {
		SpringApplication.run(MainApplication.class,args);
	}
}
