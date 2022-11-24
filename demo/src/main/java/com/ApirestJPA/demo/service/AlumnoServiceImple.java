package com.ApirestJPA.demo.service;

import com.ApirestJPA.demo.models.Alumno;
import com.ApirestJPA.demo.repository.AlumnoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class AlumnoServiceImple implements AlumnoService {

    @Autowired
    AlumnoRepository alumnoRepository;

    @Override
    public ArrayList<Alumno> getAllAlumno() {
        return (ArrayList<Alumno>)alumnoRepository.findAll();
    }

    @Override
        public Optional<Alumno> getAlumnoByID(long id) {
            return alumnoRepository.findById(id);
        }

    @Override
    public Alumno saveAlumno(Alumno a) {
        return alumnoRepository.save(a);
    }

    @Override
    public boolean deleteAlumnoByid(long id) {
        try {
            Optional<Alumno> a = getAlumnoByID(id);
            alumnoRepository.delete(a.get());
            return true;
        }catch (Exception e){
            return false;
        }
    }
}
