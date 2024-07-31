package com.example.ClinicaPostPandemia;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication
@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})
public class ClinicaPostPandemiaApplication {

    private static final Logger logger = LoggerFactory.getLogger(ClinicaPostPandemiaApplication.class);

	public static void main(String[] args) {

		SpringApplication.run(ClinicaPostPandemiaApplication.class, args);
		logger.info("Iniciando Proyecto Clinica...");
	}

}
