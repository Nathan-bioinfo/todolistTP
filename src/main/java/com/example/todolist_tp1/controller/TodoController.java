package com.example.todolist_tp1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import com.example.todolist_tp1.entity.Todolist;
import com.example.todolist_tp1.services.TodolistService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@ResponseBody
@RequestMapping("/todolist")
public class TodoController {
    /*
    @Autowired
    TodolistService todolistService;
    @GetMapping("")
    public List<Todolist> getTodoLists(){
        return todolistService.findAll();
    }
    @GetMapping("/{id}")
    public Todolist getTodoList(@PathVariable("id") Integer id) {
        return todolistService.findById(id);
    }

    @PostMapping("")
    public Todolist postProduit(@RequestBody Todolist todolist){
        if(todolistService.create(todolist)) {
            return todolist;
        }
        return null;
    }*/
}
