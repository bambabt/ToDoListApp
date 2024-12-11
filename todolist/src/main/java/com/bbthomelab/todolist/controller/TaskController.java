package com.bbthomelab.todolist.controller;

import com.bbthomelab.todolist.model.Task;
import com.bbthomelab.todolist.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/tasks")
public class TaskController {
	@Autowired
	private TaskService taskService;
	
	@GetMapping
	public List<Task> getAllTasks() {
		return taskService.getAllTasks();
	}
	
	@PostMapping
	public Task createTask(@RequestBody Task task) {
		return taskService.addTask(task);
	}
	
	@PutMapping("/{id}")
	public Task updateTask(@PathVariable Long id, @RequestBody Task task) {
		return taskService.updateTask(id, task);
	}
	
	@DeleteMapping("/{id}")
	public void deleteTask(@PathVariable Long id) {
		taskService.deleteTask(id);
	}
}
