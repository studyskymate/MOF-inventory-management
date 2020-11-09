package com.dinesh.rest.ws.rest.jobsportal.controller;

import java.io.Serializable;

public class Link implements Serializable{

		/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
		int id;
		String title;
		
		
		public Link() {
			super();
			// TODO Auto-generated constructor stub
		}


		public Link(int id, String title) {
			super();
			this.id = id;
			this.title = title;
		}


		public int getId() {
			return id;
		}


		public void setId(int id) {
			this.id = id;
		}


		public String getTitle() {
			return title;
		}


		public void setTitle(String title) {
			this.title = title;
		}


		@Override
		public String toString() {
			return "Link [id=" + id + ", title=" + title + "]";
		}
		

}
