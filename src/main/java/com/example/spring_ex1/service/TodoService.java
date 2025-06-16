package com.example.spring_ex1.service;

import com.example.spring_ex1.model.Todo;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class TodoService {

    private final List<Todo> todos = new ArrayList<>();

    public TodoService() {

        todos.add(new Todo(1L, "Apprendre Spring", "Comprendre les bases de Spring", false));
        todos.add(new Todo(2L, "Jouer", "Jouer à un Jeux-Vidéo", true));
        todos.add(new Todo(3L,"Commencer à faire du sport","Faire du sport",true));
    }

    public List<Todo> findAll() {
        return todos;
    }

    public Optional<Todo> findById(Long id) {
        return todos.stream()
                .filter(todo -> todo.getId().equals(id))
                .findFirst();
    }
}
