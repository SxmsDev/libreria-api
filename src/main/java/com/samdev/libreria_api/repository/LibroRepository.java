package com.samdev.libreria_api.repository;

import com.samdev.libreria_api.entity.Libro;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LibroRepository extends JpaRepository <Libro, Long> {
}
