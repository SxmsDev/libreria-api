package com.samdev.libreria_api.repository;

import com.samdev.libreria_api.entity.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriaRepository extends JpaRepository <Categoria, Long> {

}
