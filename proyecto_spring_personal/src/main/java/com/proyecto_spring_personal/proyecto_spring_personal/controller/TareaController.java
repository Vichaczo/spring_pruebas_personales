package com.proyecto_spring_personal.proyecto_spring_personal.controller;

import org.springframework.web.bind.annotation.RestController;

import com.proyecto_spring_personal.proyecto_spring_personal.modelo.Tarea;
import com.proyecto_spring_personal.proyecto_spring_personal.modelo.Tarea.TareaBuilder;
import com.proyecto_spring_personal.proyecto_spring_personal.repositorio.TareaRepisotorio;

import lombok.RequiredArgsConstructor;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
@RequestMapping("/todoapp")
@RequiredArgsConstructor
public class TareaController {

    private final TareaRepisotorio repo;

    @GetMapping("/status")
    public ResponseEntity<String> getStatus() {
        return ResponseEntity.status(200).body("El ms esta operativo 🍾");
    }

    /*public void Test(){
        Tarea tarea = Tarea.builder()
        .id(10000L).
        description("cocinar")
        .completed(false)
        .build();

        tarea.getDescription();
        
    }*/

    @PostMapping()
    public ResponseEntity<Tarea> agregarTarea(@RequestBody Tarea tarea) {

        repo.save(tarea);
        return ResponseEntity.status(201).body(tarea);

    }
    
    @GetMapping()
    public ResponseEntity<List<Tarea>> obtenerTodasLasTareas() {
        List tareas = repo.findAll();
        return ResponseEntity.status(200).body(tareas);
    }
    
}