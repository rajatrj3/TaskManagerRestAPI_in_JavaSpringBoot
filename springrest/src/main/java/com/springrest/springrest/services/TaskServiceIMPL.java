package com.springrest.springrest.services;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.config.Task;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PutMapping;

import com.springrest.springrest.dao.TaskDao;
import com.springrest.springrest.entities.Tasks;



@Service
public class TaskServiceIMPL implements TaskService {

	
	
	@Autowired
	private  TaskDao taskDao;
	
	public TaskServiceIMPL(){
		
		
	}
	
	
	@Override
	//getting All tasks
	public List<Tasks> getTasks() {
	
		return taskDao.findAll();
	}

	 //getting single Task
	@Override
	public Tasks getTask(long taskId) {
		
		return taskDao.getReferenceById(taskId);
	}


	@Override
	public Tasks addTask(Tasks task) {
		taskDao.save(task);
		return task;
	}


	@Override
	public Tasks UpdateTask(Tasks task) {
		taskDao.save(task);
		return task;
	}

	


	@SuppressWarnings("deprecation")
	@Override
	public void deleteTask(long  parseLong) {
	Tasks entity= taskDao.getOne(parseLong);
		taskDao.delete(entity);
	}



	

	
	
	

    
	
	

}
