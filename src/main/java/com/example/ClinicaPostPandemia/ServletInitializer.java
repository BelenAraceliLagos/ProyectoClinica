package com.example.ClinicaPostPandemia;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

public class ServletInitializer extends SpringBootServletInitializer {
	private static final Logger logger = LoggerFactory.getLogger(ClinicaPostPandemiaApplication.class);


	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		logger.info("Iniciando Servlet...");
		return application.sources(ClinicaPostPandemiaApplication.class);
	}

}
