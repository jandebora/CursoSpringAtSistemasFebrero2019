package com.curso.spring.carrito;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.context.annotation.SessionScope;

//No se está empleando
//@Configuration
public class ConfiguracionWeb {

	@Bean
	@SessionScope
	public Carrito carrito() {
		return new Carrito();
	}
	
}
