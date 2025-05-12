package com.example.programacao_web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(value = {"com.example.programacao_web.server.repository", "com.example.programacao_web.server.spec"})
@EntityScan("com.example.programacao_web.server.models")
public class ProgramacaoWebApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProgramacaoWebApplication.class, args);
	}

}
