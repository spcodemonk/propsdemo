package com.monk.propsdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;

@SpringBootApplication
@ConfigurationPropertiesScan({"com.monk.propsdemo.config"})
public class PropsdemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(PropsdemoApplication.class, args);
	}

}
