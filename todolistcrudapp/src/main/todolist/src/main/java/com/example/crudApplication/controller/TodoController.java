package com.example.crudApplication.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.crudApplication.entity.TodoEntity;
import com.example.crudApplication.service.TodoService;

@RestController
@RequestMapping("/todo")
public class TodoController {

	@Autowired
	private TodoService todoservice;
	
	@PostMapping("/save")
	public TodoEntity addentity(@RequestBody TodoEntity eachentity) {
		return todoservice.addentity(eachentity);
	}
	
	@PostMapping("/saveall")
	public List<TodoEntity> addalltodoentities(@RequestBody List<TodoEntity> listentities){
		return todoservice.Todosaveall(listentities);
	}
	
	@GetMapping("/todolist")
	public List<TodoEntity> FindAllProducts(){
		return todoservice.getAllTodolist();
	}
	
	@GetMapping("/todolist/{id}")
	public TodoEntity FindTodoListentitybyId(@PathVariable Long id) {
		return todoservice.getlistbyid(id);  
	}
	
	@DeleteMapping("/delete/{id}")
	public String deleteByid(@PathVariable Long id) {
		return todoservice.deleteTodolistbyid(id);
	}
	
	@PutMapping("/update/{id}")
	public TodoEntity updateTodoentity(@RequestBody TodoEntity todoentity,@PathVariable Long id) {
		return todoservice.updatetodolist(todoentity,id);
	}
	
	
}
