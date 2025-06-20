package com.example.spring_ex1.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Todo {
    private Long id;
    private String name;
    private String description;
    private boolean isDone;
}

