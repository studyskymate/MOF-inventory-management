package com.dinesh.rest.ws.rest.todo.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dinesh.rest.ws.rest.todo.Todo;
import java.lang.String;
import java.util.List;

@Repository
public interface TodoJPARepository extends JpaRepository<Todo, Long>{
	
	List<Todo> findByUsername(String username);

	
	Page<Todo> findByUsername(String username, Pageable pageable);




}
