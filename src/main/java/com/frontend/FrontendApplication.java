package com.frontend;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.frontend.domain.Categoria;
import com.frontend.repositories.CategoriaRepository;

@SpringBootApplication
public class FrontendApplication implements CommandLineRunner{
	
	@Autowired
	private CategoriaRepository catRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(FrontendApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Categoria cat1 = new Categoria(null, "Informática");
		Categoria cat2 = new Categoria(null, "Escritório");
		
		catRepository.saveAll(Arrays.asList(cat1,cat2));
	}

}
