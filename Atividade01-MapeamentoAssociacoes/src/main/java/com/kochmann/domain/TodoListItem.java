package com.kochmann.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class TodoListItem implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String nomeDoItem;
	
	@ManyToOne
	//@JoinColumn(name="todolist_id", nullable = false)
	private TodoList todolist;
	
	public TodoListItem() {
	}

	public TodoListItem(Integer id, String nomeDoItem, TodoList todolist) {
		super();
		this.id = id;
		this.nomeDoItem = nomeDoItem;
		this.todolist = todolist;
	}



	public String getNomeDoItem() {
		return nomeDoItem;
	}

	public void setNomeDoItem(String nomeDoItem) {
		this.nomeDoItem = nomeDoItem;
	}

	public Integer getId() {
		return id;
	}



	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TodoListItem other = (TodoListItem) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	public TodoList getTodolist() {
		return todolist;
	}

	public void setTodolist(TodoList todolist) {
		this.todolist = todolist;
	}
	
	
}