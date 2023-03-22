package me.dio.academia.digital;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@EntityScan(basePackages = "me.dio.academia.digital")
@SpringBootApplication
public class AcademiaDigitalApplication {

	public static void main(String[] args) {
		SpringApplication.run(AcademiaDigitalApplication.class, args);
	}

}
