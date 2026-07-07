package com.samdev.libreria_api.controller;

import com.samdev.libreria_api.entity.Libro;
import com.samdev.libreria_api.service.LibroService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

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
    @GetMapping("/{id}")
    public Optional<Libro> buscarLibroPorId(@PathVariable Long id){
        return libroService.encontrarLibroPorId(id);
    }
    @PutMapping("/{id}")
    public Libro editarLibro(@PathVariable Long id, @RequestBody Libro libro) {
        return libroService.editarLibro(id, libro);
    }
    @DeleteMapping("/{id}")
    public void eliminarLibro(@PathVariable Long id){
        libroService.eliminarLibro(id);
    }

}
