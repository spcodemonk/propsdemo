package com.monk.propsdemo;

import com.monk.propsdemo.config.BufferProperties;
import com.monk.propsdemo.mp.MyClass;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@ConfigurationPropertiesScan({"com.monk.propsdemo.config"})
public class PropsdemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(PropsdemoApplication.class, args);
	}

	@Bean
	public MyClass myClass(BufferProperties bufferProperties){
		System.out.println("----------------------------------------------------------------------");

		bufferProperties.getBufferTimes().forEach(buffer-> System.out.println(buffer.getType() +"---" + buffer.getLevelTwo().getProperty1()));

		System.out.println("-----------------------------------------------------------------------");
		return new MyClass();
	}
}
