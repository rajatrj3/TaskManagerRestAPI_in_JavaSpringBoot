package com.springrest.springrest.services;

import java.util.List;

import com.springrest.springrest.entities.Tasks;

public interface TaskService {
	
	
	

	public List<Tasks> getTasks();

	
	public Tasks getTask(long taskId);


	public Tasks addTask(Tasks task);


	public Tasks UpdateTask(Tasks task);


	public void deleteTask(long parseLong);

}
