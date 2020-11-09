package com.dinesh.rest.ws.rest.todo;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.dinesh.rest.ws.rest.jobsportal.entity.dto.TodoResponse;
import com.dinesh.rest.ws.rest.todo.Todo;
import com.dinesh.rest.ws.rest.todo.repository.TodoJPARepository;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
public class TodoJPAResource {

//	@Autowired
//	private TodoHardcodedService todoService;

	@Autowired
	private TodoJPARepository todoService;

	@GetMapping("/jpa/users/{username}/todos")
	public List<Todo> getAllTodos(@PathVariable String username) {
		System.out.println(todoService.findAll());
		return todoService.findByUsername(username);
	}

	@GetMapping("/jpa/users/{username}/todos/{page}/{pagesize}")
	public List<Todo> getAllTodos1(@PathVariable(value = "username") String username,
			@PathVariable(value = "page") int page, @PathVariable(value = "pagesize") int pagesize) {

		Pageable pageable = PageRequest.of(page - 1, pagesize);
		Page<Todo> pageofTodo = todoService.findByUsername(username, pageable);

		List<Todo> getTodosList = pageofTodo.getContent();

		return getTodosList;

	}

	@GetMapping("/jpa/users/{username}/todos/v2/{page}/{pagesize}")
	public TodoResponse getAllTodos2(@PathVariable(value = "username") String username,
			@PathVariable(value = "page") int page, @PathVariable(value = "pagesize") int pagesize,
			@RequestParam(value="sortField", defaultValue="targetDate") String sortField,
			@RequestParam(value="sortDirection", defaultValue="ASC") String sortDirection) {

		// Paging
		TodoResponse todoResponse = new TodoResponse();
	
		// Sorting
		//Create Sort method based on the request parameter
		Sort sort = sortDirection.equalsIgnoreCase(Sort.Direction.ASC.name()) ? Sort.by(sortField).ascending()
				: Sort.by(sortField).descending();
		
		//Create PageRequest Object and pass page and sorting parameter 
		Pageable pageable = PageRequest.of(page - 1, pagesize,sort);
		
		Page<Todo> pageofTodo = todoService.findByUsername(username, pageable);

		List<Todo> getTodosList = pageofTodo.getContent();
		todoResponse.setCurrentPage(page);
		todoResponse.setTotalItems(pageofTodo.getTotalElements());
		todoResponse.setTotalPages(pageofTodo.getTotalPages());
		todoResponse.setSortField(sortField);
		todoResponse.setSortDirection(sortDirection.equals("asc")?"desc":"asc");
		todoResponse.setRecordPerPage(pagesize);
		todoResponse.setTodosList(getTodosList);
		
        //Return Response
		return todoResponse;

	}



	@GetMapping("/jpa/users/{username}/todos/{id}")
	public Todo getTodo(@PathVariable String username, @PathVariable long id) {

		return todoService.findById(id).get();
	}

	// DELETE /users/{username}/todos/{id}
	@DeleteMapping("/jpa/users/{username}/todos/{id}")
	public ResponseEntity<Void> deleteTodo(@PathVariable String username, @PathVariable long id) {

		todoService.deleteById(id);

		return ResponseEntity.ok().build();
	}

	// Edit/Update a Todo
	// PUT /users/{user_name}/todos/{todo_id}
	@PutMapping("/jpa/users/{username}/todos/{id}")
	public ResponseEntity<Todo> updateTodo(@PathVariable String username, @PathVariable long id,
			@RequestBody Todo todo) {
		System.out.println("PUT");
		Todo todoUpdated = todoService.save(todo);

		return new ResponseEntity<Todo>(todo, HttpStatus.OK);
	}

	@PostMapping("/jpa/users/{username}/todos")
	public ResponseEntity<Void> updateTodo(@PathVariable String username, @RequestBody Todo todo) {

		Todo createdTodo = todoService.save(todo);

		System.out.println("Data saved"+createdTodo);
		// Location
		// Get current resource url
		/// {id}
		// URI uri = ServletUriComponentsBuilder.fromCurrentRequest()
		// .path("/{id}").buildAndExpand(createdTodo.getId()).toUri();

		return ResponseEntity.ok().build();
	}

}
