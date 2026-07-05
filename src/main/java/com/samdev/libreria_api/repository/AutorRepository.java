package com.samdev.libreria_api.repository;

import com.samdev.libreria_api.entity.Autor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AutorRepository extends JpaRepository <Autor, Long> {

}
