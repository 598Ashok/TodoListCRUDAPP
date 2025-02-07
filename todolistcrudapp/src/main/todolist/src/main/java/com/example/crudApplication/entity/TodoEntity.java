package com.example.crudApplication.entity;

import java.sql.Date;

import jakarta.annotation.Generated;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(name="Todolist")
public class TodoEntity {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    
    @Column(name="description")
    private String description;
    
    @Column(name="task_values") 
    private String taskValues;
    
    @Column(name="duedate")
    private String duedate;
    
    @Column(name="userid")
    private long userid;
    
    public TodoEntity() {
        super();
    }

    public TodoEntity(long id, String description, String taskValues, String duedate, long userid) {
        super();
        this.id = id;
        this.description = description;
        this.taskValues = taskValues;
        this.duedate = duedate;
        this.userid = userid;
    }
    
    public long getId() {
        return id;
    }
    
    public void setId(long id) {
        this.id = id;
    }
    
    public String getDescription() {
        return description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }
    
    public String getTaskValues() {
        return taskValues;
    }
    
    public void setTaskValues(String taskValues) {
        this.taskValues = taskValues;
    }
    
    public String getDuedate() {
        return duedate;
    }
    
    public void setDuedate(String duedate) {
        this.duedate = duedate;
    }
    
    public long getUserid() {
        return userid;
    }
    
    public void setUserid(long userid) {
        this.userid = userid;
    }

    @Override
    public String toString() {
        return "TodoEntity [id=" + id + ", description=" + description + ", taskValues=" + taskValues 
                + ", duedate=" + duedate + ", userid=" + userid + "]";
    }
}
