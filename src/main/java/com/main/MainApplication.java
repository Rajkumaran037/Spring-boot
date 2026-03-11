package com.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = "com.example"
//		,exclude = {DataSourceAutoConfiguration.class } for removing DB connection error
)
@EnableJpaRepositories(basePackages = "com.example") // ✅ finds Repository
@EntityScan(basePackages = "com.example")
//@EnableJpaRepositories(basePackages = "com.example.core.user")
//@EntityScan(basePackages = "com.example.core.user")
public class MainApplication {
	public static void main(String[] args) {
		SpringApplication.run(MainApplication.class,args);
	}
}
