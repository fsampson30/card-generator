package com.sampson.card_generator;

import org.flywaydb.core.Flyway;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CardGeneratorApplication {

	public static void main(String[] args) {
		SpringApplication.run(CardGeneratorApplication.class, args);
	}

}
