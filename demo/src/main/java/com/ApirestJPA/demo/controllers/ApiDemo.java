package com.ApirestJPA.demo.controllers;

import com.ApirestJPA.demo.service.AlumnoService;
import com.ApirestJPA.demo.models.Alumno;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;

@RestController
@RequestMapping("api")
public class ApiDemo {

    @Autowired
    AlumnoService alumnoService;
    @GetMapping("/hola")
    public String saluda(){return "Hola te saludo";}
    @GetMapping("/all")
    public ArrayList<Alumno> getAllAlumno(){
        return alumnoService.getAllAlumno();
    }
    @GetMapping("/find/{id}")
    public Optional<Alumno> getAlumnoById(@PathVariable("id")long id){
        return alumnoService.getAlumnoByID(id);
    }
    @PostMapping("/save")
    public Alumno saveAlumno(@RequestBody Alumno a){
        return alumnoService.saveAlumno(a);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteAlumnoById(@PathVariable("id") long id){
        if(alumnoService.deleteAlumnoByid(id))
            return "se ha eliminado el alumno";
        else
            return "no se ha podido eliminar el alumno";
    }

}
