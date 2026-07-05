package com.samdev.libreria_api.service;

import com.samdev.libreria_api.repository.LibroRepository;
import org.springframework.stereotype.Service;

@Service
public class LibroService {
    private final LibroRepository libroRepository;

    public LibroService(LibroRepository libroRepository) {
        this.libroRepository = libroRepository;
    }
}
