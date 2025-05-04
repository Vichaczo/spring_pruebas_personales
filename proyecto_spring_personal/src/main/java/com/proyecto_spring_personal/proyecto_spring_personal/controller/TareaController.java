package com.proyecto_spring_personal.proyecto_spring_personal.controller;

import org.springframework.web.bind.annotation.RestController;

import com.proyecto_spring_personal.proyecto_spring_personal.modelo.Tarea;
import com.proyecto_spring_personal.proyecto_spring_personal.modelo.Tarea.TareaBuilder;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping()
public class TareaController {
    @GetMapping("/status")
    public ResponseEntity<String> getStatus() {
        return ResponseEntity.status(200).body("El ms esta operativo 🍾");
    }

    public void Test(){
        Tarea tarea = Tarea.builder()
        .id(10000L).
        description("aseo")
        .completed(false)
        .build();

        tarea.getDescription();
        
    }
    
}