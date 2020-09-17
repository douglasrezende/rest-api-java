package br.com.gpa.siac.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

import br.com.gpa.siac.application.controller.SiacController;


@SpringBootApplication (exclude = SecurityAutoConfiguration.class)
@ComponentScan(basePackageClasses = SiacController.class)
public class SiacApplication {

	public static void main(String[] args) {
		SpringApplication.run(SiacApplication.class, args);
	}

}
