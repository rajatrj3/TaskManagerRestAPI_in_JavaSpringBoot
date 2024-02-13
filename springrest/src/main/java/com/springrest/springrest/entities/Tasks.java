package com.springrest.springrest.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

//ENTITY CLASS
@Entity
public class Tasks {
	
	@Id
	private long taskid;
	private String tasks;
	private String description;
	
	
	
	//default constructor
	public Tasks() {
		super();
		
	}



   //parameterized constructor
	public Tasks(long taskid, String tasks, String description) {
		super();
		this.taskid = taskid;
		this.tasks = tasks;
		this.description = description;
	}


    //getters and setters
	public long getTaskid() {
		return taskid;
	}



	@Override
	public String toString() {
		return "Tasks [taskid=" + taskid + ", tasks=" + tasks + ", description=" + description + "]";
	}



	public void setTaskid(long taskid) {
		this.taskid = taskid;
	}



	public String getTasks() {
		return tasks;
	}



	public void setTasks(String tasks) {
		this.tasks = tasks;
	}



	public String getDescription() {
		return description;
	}



	public void setDescription(String description) {
		this.description = description;
	}

}
