package com.zambrano.demo.repository;

import com.zambrano.demo.entity.Categoria;
import org.springframework.data.repository.CrudRepository;

public interface CategoriaRepository extends CrudRepository<Categoria, Long>{
    
}