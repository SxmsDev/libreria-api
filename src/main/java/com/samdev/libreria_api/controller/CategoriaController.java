package com.samdev.libreria_api.controller;

import com.samdev.libreria_api.entity.Categoria;
import com.samdev.libreria_api.service.CategoriaService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping ("/categorias")
public class CategoriaController {
    private final CategoriaService categoriaService;

    public CategoriaController(CategoriaService categoriaService) {
        this.categoriaService = categoriaService;
    }
    @GetMapping
    public List<Categoria> obtenerCategorias(){
        return categoriaService.obtenerCategoria();
    }
    @PostMapping
    public Categoria guardarCategorias(@RequestBody Categoria categoria){
        return categoriaService.guardarCategoria(categoria);
    }
}
