package com.samdev.libreria_api.controller;

import com.samdev.libreria_api.entity.Autor;
import com.samdev.libreria_api.service.AutorService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("autores")
public class AutorController {
    private final AutorService autorService;

    public AutorController(AutorService autorService) {
        this.autorService = autorService;
    }
    @GetMapping
    public List<Autor> obtenerAutores(){
        return autorService.obtenerAutor();
    }
    @PostMapping
    public Autor guardarAutores(@RequestBody Autor autor){
        return autorService.guardarAutor(autor);
    }
}
