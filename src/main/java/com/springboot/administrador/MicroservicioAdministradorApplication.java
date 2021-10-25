package com.springboot.administrador;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@EntityScan({"com.springboot.commons.usuarios.entity"})
@SpringBootApplication
public class MicroservicioAdministradorApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroservicioAdministradorApplication.class, args);
	}

}
