package com.samdev.libreria_api.service;

import com.samdev.libreria_api.entity.Categoria;
import com.samdev.libreria_api.repository.CategoriaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoriaService {
    private final CategoriaRepository categoriaRepository;

    public CategoriaService(CategoriaRepository categoriaRepository) {
        this.categoriaRepository = categoriaRepository;
    }
    public List<Categoria> obtenerCategoria(){
        return categoriaRepository.findAll();
    }
    public Categoria guardarCategoria(Categoria categoria){
        return categoriaRepository.save(categoria);
    }
}
