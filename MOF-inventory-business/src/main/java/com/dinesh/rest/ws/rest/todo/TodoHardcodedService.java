package com.dinesh.rest.ws.rest.todo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;


@Service
public class TodoHardcodedService {
	
	private static List<Todo> todos = new ArrayList<>();
	private static Long idCounter = 0L;
	
	static {
		todos.add(new Todo(++idCounter, "dinesh","Learn Spring Boot", new Date(), false ));
		todos.add(new Todo(++idCounter, "dinesh","Learn Microservices ", new Date(), false ));
		todos.add(new Todo(++idCounter, "dinesh","Learn Angular", new Date(), false ));
		todos.add(new Todo(++idCounter, "dinesh","Learn System Design", new Date(), false ));
		todos.add(new Todo(++idCounter, "dinesh","Learn Spring Boot", new Date(), false ));
		todos.add(new Todo(++idCounter, "dinesh","Learn Microservices ", new Date(), false ));
		todos.add(new Todo(++idCounter, "dinesh","Learn Angular", new Date(), false ));
		todos.add(new Todo(++idCounter, "dinesh","Learn System Design", new Date(), false ));
		todos.add(new Todo(++idCounter, "dinesh","Learn Spring Boot", new Date(), false ));
		todos.add(new Todo(++idCounter, "dinesh","Learn Microservices ", new Date(), false ));
		todos.add(new Todo(++idCounter, "dinesh","Learn Angular", new Date(), false ));
		todos.add(new Todo(++idCounter, "dinesh","Learn System Design", new Date(), false ));
	}
	
	public List<Todo> findAll() {
		return todos;
	}

	public Todo save(Todo todo) {
		if(todo.getId()==-1 || todo.getId()==0) {
			todo.setId(++idCounter);
			todos.add(todo);
		} else {
			deleteById(todo.getId());
			todos.add(todo);
		}
		return todo;
	}
	
	public Todo deleteById(long id) {
		Todo todo = findById(id);
		
		if(todo==null) return null;
		
		if(todos.remove(todo)) {
			return todo;
		}
		
		return null;
	}

	public Todo findById(long id) {
		for(Todo todo:todos) {
			if(todo.getId() == id) {
				return todo;
			}
		}
		
		return null;
	}

	
}
