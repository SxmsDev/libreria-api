package com.samdev.libreria_api.service;

import com.samdev.libreria_api.entity.Libro;
import com.samdev.libreria_api.repository.LibroRepository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class LibroService {
    private final LibroRepository libroRepository;

    public LibroService(LibroRepository libroRepository) {
        this.libroRepository = libroRepository;
    }
    public List<Libro> obtenerTodosLosLibros(){
        return libroRepository.findAll();
    }
    public Libro guardarLibro(Libro libro) {
        return libroRepository.save(libro);
    }

}
