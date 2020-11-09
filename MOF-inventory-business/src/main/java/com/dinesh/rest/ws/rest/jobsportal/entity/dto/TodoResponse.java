package com.dinesh.rest.ws.rest.jobsportal.entity.dto;

import java.io.Serializable;
import java.util.List;

import javax.validation.constraints.NotNull;

import com.dinesh.rest.ws.rest.todo.Todo;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import springfox.documentation.spring.web.json.Json;

public class TodoResponse implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private int currentPage;
	private int totalPages;
	private long totalItems;
	private String sortField;
	private String sortDirection;
	private int recordPerPage;
	
	private List<Todo> todosList;
	
	public int getCurrentPage() {
		return currentPage;
	}
	public void setCurrentPage(int currentPage) {
		this.currentPage = currentPage;
	}
	public int getTotalPages() {
		return totalPages;
	}
	public void setTotalPages(int totalPages) {
		this.totalPages = totalPages;
	}
	public long getTotalItems() {
		return totalItems;
	}
	public void setTotalItems(long l) {
		this.totalItems = l;
	}
	public List<Todo> getTodosList() {
		return todosList;
	}
	public void setTodosList(List<Todo> todosList) {
		this.todosList = todosList;
	}
	public String getSortField() {
		return sortField;
	}
	public void setSortField(String sortField) {
		this.sortField = sortField;
	}
	public String getSortDirection() {
		return sortDirection;
	}
	public void setSortDirection(String sortDirection) {
		this.sortDirection = sortDirection;
	}
	public int getRecordPerPage() {
		return recordPerPage;
	}
	public void setRecordPerPage(int recordPerPage) {
		this.recordPerPage = recordPerPage;
	}
	
	
	
}
