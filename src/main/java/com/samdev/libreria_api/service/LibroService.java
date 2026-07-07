package com.samdev.libreria_api.service;

import com.samdev.libreria_api.entity.Libro;
import com.samdev.libreria_api.repository.LibroRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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
    public Optional<Libro> encontrarLibroPorId(Long id) {
        return libroRepository.findById(id);
    }
    public Libro editarLibro(Long id, Libro libro) {
        Optional<Libro> libroExistente = libroRepository.findById(id);
        if (libroExistente.isPresent()) {
            Libro libroActual = libroExistente.get();
            libroActual.setTitulo(libro.getTitulo());
            libroActual.setAnioDePublicacion(libro.getAnioDePublicacion());
            libroActual.setCantidad(libro.getCantidad());
            libroActual.setIsbn(libro.getIsbn());
            libroActual.setDescripcion(libro.getDescripcion());
            libroActual.setPrecio(libro.getPrecio());
            libroActual.setAutor(libro.getAutor());
            libroActual.setCategoria(libro.getCategoria());
            return libroRepository.save(libroActual);
        } else {
             System.out.println("No existe el libro");
             return null;
        }
    }
    public void eliminarLibro(Long id) {
        libroRepository.deleteById(id);
    }
}
