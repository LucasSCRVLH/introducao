package com.poo.introducao;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class IntroducaoApplication {

	public static void main(String[] args) {
		Lista01 lista = new Lista01();
		
		SpringApplication.run(IntroducaoApplication.class, args);
		Lista01.ex1();
		Lista01.ex2();
	}

}
