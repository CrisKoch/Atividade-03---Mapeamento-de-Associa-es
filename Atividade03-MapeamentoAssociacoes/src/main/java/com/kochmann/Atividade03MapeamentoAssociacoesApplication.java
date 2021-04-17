package com.kochmann;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.kochmann.domain.Post;
import com.kochmann.domain.PostComment;
import com.kochmann.repository.PostCommentRepository;
import com.kochmann.repository.PostRepository;

@SpringBootApplication
public class Atividade03MapeamentoAssociacoesApplication implements CommandLineRunner{

	
	@Autowired 
	PostRepository postRepo;
	
	@Autowired
	PostCommentRepository postCommentRepo;
	
	public static void main(String[] args) {
		SpringApplication.run(Atividade03MapeamentoAssociacoesApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Post postElogio = new Post(null,"Elogio" );

		postRepo.save(postElogio);
		
		PostComment postComment_1 = new PostComment(null, "Bom", postElogio); 
		PostComment postComment_2 = new PostComment(null, "Excelente", postElogio); 
		PostComment postComment_3 = new PostComment(null, "Repeticao", postElogio); 
		
		postCommentRepo.save(postComment_1);
		postCommentRepo.save(postComment_2);
		postCommentRepo.save(postComment_3);
		
		postRepo.save(postElogio);
	}

	
	
}