package com.example.crudApplication.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.crudApplication.entity.TodoEntity;
import com.example.crudApplication.repository.TodoRepository;

@Service
public class TodoService {

	@Autowired
	private TodoRepository todorepo;
	
	public TodoEntity addentity(TodoEntity todoenti) {
		return todorepo.save(todoenti);
	}
	
	public List<TodoEntity> Todosaveall(List<TodoEntity> todolist) {
		return todorepo.saveAll(todolist);
	}
	
	public List<TodoEntity> getAllTodolist() {
		return todorepo.findAll();
	}
	
	public TodoEntity getlistbyid(Long id){
		return todorepo.findById(id).orElse(null);
	}
	
	public String deleteTodolistbyid(Long id) {
		 todorepo.deleteById(id);
		 return "product removed "+id;
	}

	public TodoEntity updatetodolist(TodoEntity todoentity,Long id) {
		TodoEntity existingtodoentity=todorepo.findById(id).orElse(null);
		
		existingtodoentity.setDescription(todoentity.getDescription());
		existingtodoentity.setDuedate(todoentity.getDuedate());
		existingtodoentity.setUserid(todoentity.getUserid());
		existingtodoentity.setTaskValues(todoentity.getTaskValues());
		
		return todorepo.save(existingtodoentity);
		
	}
}
