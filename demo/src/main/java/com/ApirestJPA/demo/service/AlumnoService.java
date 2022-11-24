package com.ApirestJPA.demo.service;

import com.ApirestJPA.demo.models.Alumno;

import java.util.ArrayList;
import java.util.Optional;


public interface AlumnoService {
    ArrayList<Alumno>getAllAlumno();
    Optional<Alumno>getAlumnoByID(long id);
    Alumno saveAlumno (Alumno a);
    boolean deleteAlumnoByid(long id);
}
