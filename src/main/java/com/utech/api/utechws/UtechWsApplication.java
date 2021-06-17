package com.utech.api.utechws;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
public class UtechWsApplication {

	public static void main(String[] args) {
		SpringApplication.run(UtechWsApplication.class, args);
	}

}
