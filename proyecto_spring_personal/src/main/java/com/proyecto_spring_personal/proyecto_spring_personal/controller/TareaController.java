package com.proyecto_spring_personal.proyecto_spring_personal.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping()
public class TareaController {
    @GetMapping("/status")
    public String getStatus() {
        return "El ms TodoApp esta operativo 🥂";
    }
    
}