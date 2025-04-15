package com.example.programacao_web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = SecurityAutoConfiguration.class)
public class ProgramacaoWebApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProgramacaoWebApplication.class, args);
	}

}
