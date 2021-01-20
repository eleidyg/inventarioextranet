package com.boot.extranet;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages={"com.extranet.inventario.controller","com.extranet.inventario.dao","com.extranet.inventario.service"})
@EnableJpaRepositories(basePackages={"com.extranet.inventario.dao"})
@EntityScan(basePackages={"com.extranet.inventario.model"})
public class InventarioExtranetApplication {

	public static void main(String[] args) {
		SpringApplication.run(InventarioExtranetApplication.class, args);
	}

}
