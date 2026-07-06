package com.samdev.libreria_api.service;

import com.samdev.libreria_api.entity.Autor;
import com.samdev.libreria_api.repository.AutorRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AutorService {
    private final AutorRepository autorRepository;

    public AutorService(AutorRepository autorRepository) {
        this.autorRepository = autorRepository;
    }
    public List<Autor> obtenerAutor(){
        return autorRepository.findAll();
    }
    public Autor guardarAutor(Autor autor){
        return autorRepository.save(autor);
    }
}
