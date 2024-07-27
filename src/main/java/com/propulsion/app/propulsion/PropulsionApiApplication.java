package com.propulsion.app.propulsion;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(scanBasePackages = "com.propulsion.app.propulsion")
public class PropulsionApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(PropulsionApiApplication.class, args);
	}

}
