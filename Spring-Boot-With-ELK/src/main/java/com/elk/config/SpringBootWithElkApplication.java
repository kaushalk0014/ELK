package com.elk.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication(exclude = { DataSourceAutoConfiguration.class })
@ComponentScan(basePackages = "com.elk.config, com.elk")
public class SpringBootWithElkApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootWithElkApplication.class, args);
	}

}
