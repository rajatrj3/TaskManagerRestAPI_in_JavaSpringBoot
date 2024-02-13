package com.springrest.springrest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springrest.springrest.entities.Tasks;
import com.springrest.springrest.services.TaskService;

@RestController
public class MyController {
	
	
	@Autowired
	private TaskService taskservice;
	
	
	
//GET THE TASKS
	
	@GetMapping("/Tasks")
	public List<Tasks>getTasks(){
		
		return this.taskservice.getTasks();
		
		}
	
	//Getting single Task
	@GetMapping("/Tasks/{taskId}")
	public Tasks getTask(@PathVariable String taskId) {
		
	return this.taskservice.getTask(Long.parseLong(taskId));
		
	}
	
	//Adding Task
	@PostMapping("/Tasks")
	public Tasks addTask(@RequestBody Tasks task) {
		
		return this.taskservice.addTask(task);
	}
	
	
	//updating task
	@PutMapping("/Tasks")
	public Tasks UpdateTask(@RequestBody Tasks task) {
			
			return this.taskservice.UpdateTask(task);
	}
	
	
	
	//delete task
	@DeleteMapping("/Tasks/{taskId}")
	public ResponseEntity<HttpStatus> deleteTask(@PathVariable String taskId){
		try {
			this.taskservice.deleteTask(Long.parseLong(taskId));
			return new ResponseEntity<>(HttpStatus.OK);
		}catch( Exception e) {
		return  new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
	}

}
