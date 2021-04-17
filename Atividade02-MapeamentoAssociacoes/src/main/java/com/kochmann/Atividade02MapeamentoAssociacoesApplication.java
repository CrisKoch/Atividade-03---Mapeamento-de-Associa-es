package com.kochmann;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.kochmann.domain.Book;
import com.kochmann.domain.Library;
import com.kochmann.repository.BookRepository;
import com.kochmann.repository.LibraryRepository;

@SpringBootApplication
public class Atividade02MapeamentoAssociacoesApplication implements CommandLineRunner{
	
	@Autowired
	BookRepository bookRepo;

	@Autowired
	LibraryRepository libraryRepo;
	
	public static void main(String[] args) {
		SpringApplication.run(Atividade02MapeamentoAssociacoesApplication.class, args);
	}
	
	@Override
	public void run(String... args) throws Exception {
		Library l1 = new Library(null, "Juridica");
		libraryRepo.save(l1);
		
		Book book1 = new Book(null, "Civil", l1);
		Book book2 = new Book(null, "Criminal", l1);
		Book book3 = new Book(null, "Familia", l1);
		Book book4 = new Book(null, "Meio Ambiente", l1);
		
		bookRepo.save(book1);
		bookRepo.save(book2);
		bookRepo.save(book3);
		bookRepo.save(book4);
		libraryRepo.save(l1);
		
		
	
	}

}