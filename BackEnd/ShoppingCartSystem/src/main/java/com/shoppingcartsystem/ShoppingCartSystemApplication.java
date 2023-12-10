package com.shoppingcartsystem;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.CrossOrigin;

@SpringBootApplication
@ConfigurationPropertiesScan
//@CrossOrigin(origins = "http://localhost:3000")
public class ShoppingCartSystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(ShoppingCartSystemApplication.class, args);
	}
	
	@Bean
	public ModelMapper modelMapper() {
		return new ModelMapper();
	}

}
