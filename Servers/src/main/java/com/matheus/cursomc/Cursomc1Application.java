package com.matheus.cursomc;

import java.sql.Array;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import domain.Categoria;
import domain.Produto;
import repositories.CategoriaRepository;
import repositories.ProdutoRepository;

@SpringBootApplication
public class Cursomc1Application {

	public static void main(String[] args) {
		SpringApplication.run(Cursomc1Application.class, args);
	}
}
	
//	
//	@Override
//	public void run(String... args) throws Exception{
//		
//	Categoria cat1 = new Categoria(null, "Informática");
//	Categoria cat2 = new Categoria(null, "Escritório");
//	
//	Produto p1 = new Produto(null, "Computador", 2000.00);
//	Produto p2 = new Produto(null, "Impressora", 800.00);
//	Produto p3 = new Produto(null, "Mouse", 80.00);
//	
//	cat1.getProdutos().addAll(Array.asList(p1, p2, p3));
//	cat2.getProdutos().addAll(Array.asList(p2));
//
//	
//	
//	p1.getCategorias().addAll(Array.asList(cat1));
//	p2.getCategorias().addAll(Array.asList(cat1, cat2));
//	p3.getCategorias().addAll(Array.asList(cat1));
//
//	
//	categoriaRepository.save(Array.asList(cat1, cat2));
//	produtoRepository.save(Array.asList(p1, p2, p3));
//	
//}
//}
