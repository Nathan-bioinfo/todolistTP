package com.example.todolist_tp1.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Todolist {
    private int id;
    private String titre;
    private String description;
    private Date date;
    private boolean etat;
}