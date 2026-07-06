package com.samdev.libreria_api.controller;

import com.samdev.libreria_api.entity.Libro;
import com.samdev.libreria_api.service.LibroService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/libros")
public class LibroController {
    private final LibroService libroService;

    public LibroController(LibroService libroService) {
        this.libroService = libroService;
    }
    @GetMapping
    public List<Libro> obtenerTodosLosLibros() {
        return libroService.obtenerTodosLosLibros();
    }
    @PostMapping
    public Libro guardarLibro(@RequestBody Libro libro){
        return libroService.guardarLibro(libro);
    }
}
