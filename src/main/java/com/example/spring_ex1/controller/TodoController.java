package com.example.spring_ex1.controller;

import com.example.spring_ex1.model.Todo;
import com.example.spring_ex1.service.TodoService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/todos")
public class TodoController {

    private final TodoService todoService;

    public TodoController(TodoService todoService) {
        this.todoService = todoService;
    }

    @GetMapping
    public String getAllTodos(Model model) {
        model.addAttribute("todos", todoService.findAll());
        return "todos";
    }


    @GetMapping("/{id}")
    public String getTodoById(@PathVariable Long id, Model model) {
        Todo todo = todoService.findById(id)
                .orElseThrow(() -> new RuntimeException("Todo non trouvée avec l'id : " + id));
        model.addAttribute("todo", todo);
        return "todo";
    }
}