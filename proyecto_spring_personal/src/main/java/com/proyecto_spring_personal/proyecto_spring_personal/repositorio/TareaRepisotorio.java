package com.proyecto_spring_personal.proyecto_spring_personal.repositorio;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.proyecto_spring_personal.proyecto_spring_personal.modelo.Tarea;

@Repository
public class TareaRepisotorio {
    private final List<Tarea> tareas = new ArrayList<>();
    private Long nextId = 1L;

    public List<Tarea> findAll()
    {
        return tareas;
    }

    public Tarea save(Tarea tarea)
    {
        tarea.setId(nextId++);
        tareas.add(tarea);
        return tarea;
    }
}
