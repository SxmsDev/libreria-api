package com.samdev.libreria_api.controller;

import com.samdev.libreria_api.entity.Libro;
import com.samdev.libreria_api.service.LibroService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
    public ResponseEntity<List<Libro>> obtenerTodosLosLibros() {
        return ResponseEntity.ok(libroService.obtenerTodosLosLibros());
    }
    @PostMapping
    public ResponseEntity <Libro> guardarLibro(@Valid @RequestBody Libro libro){
        Libro libroGuardado = libroService.guardarLibro(libro);
        return ResponseEntity.status(HttpStatus.CREATED).body(libroGuardado);
    }
    @GetMapping("/{id}")
    public ResponseEntity<Libro> buscarLibroPorId(@PathVariable Long id) {

        Optional<Libro> libroEncontrado = libroService.encontrarLibroPorId(id);

        if (libroEncontrado.isPresent()) {
            return ResponseEntity.ok(libroEncontrado.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }
    @PutMapping("/{id}")
    public ResponseEntity <Libro> editarLibro(@Valid @PathVariable Long id, @RequestBody Libro libro) {
        Libro libroActualizado = libroService.editarLibro(id, libro);
         return ResponseEntity.status(HttpStatus.OK).body(libroActualizado);
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminarLibro(@PathVariable Long id) {

        libroService.eliminarLibro(id);

        return ResponseEntity.noContent().build();
    }
}
