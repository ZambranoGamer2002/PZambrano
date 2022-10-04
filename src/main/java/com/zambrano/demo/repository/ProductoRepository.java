package com.zambrano.demo.repository;

import com.zambrano.demo.entity.Producto;
import org.springframework.data.repository.CrudRepository;

public interface ProductoRepository extends CrudRepository<Producto, Long>{
    
}
