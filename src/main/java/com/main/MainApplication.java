package com.main;

import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = "com.example.core.user"
//		,exclude = {DataSourceAutoConfiguration.class } for removing DB connection error
)
@EnableJpaRepositories(basePackages = "com.example.core.user")
@EntityScan(basePackages = "com.example.core.user")
public class MainApplication {
	public static void main(String[] args) {
		SpringApplication.run(MainApplication.class,args);
	}
}
