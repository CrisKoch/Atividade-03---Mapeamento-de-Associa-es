package com.kochmann;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.kochmann.domain.TodoList;
import com.kochmann.domain.TodoListItem;
import com.kochmann.repository.TodoListItemRepository;
import com.kochmann.repository.TodoListRepository;

@SpringBootApplication
public class Atividade01MapeamentoAssociacoesApplication implements CommandLineRunner{

	@Autowired
	TodoListRepository todoRepository;
	
	@Autowired
	TodoListItemRepository itemRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(Atividade01MapeamentoAssociacoesApplication.class, args);
	}
	
		
	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		TodoList td = new TodoList("teste",null);
		todoRepository.save(td);
		
		TodoListItem item1 = new TodoListItem(null, "item1", td);
		TodoListItem item2 = new TodoListItem(null, "item2", td);
		TodoListItem item3 = new TodoListItem(null, "item3", td);
		TodoListItem item4 = new TodoListItem(null, "item4", td);
		
		
		itemRepository.save(item1);
		itemRepository.save(item2);
		itemRepository.save(item3);
		itemRepository.save(item4);
		
		todoRepository.save(td);
		
		
		
	}

}