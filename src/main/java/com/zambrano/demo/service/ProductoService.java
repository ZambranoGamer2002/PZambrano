package com.zambrano.demo.service;

import com.zambrano.demo.entity.Producto;
import java.util.List;

public interface ProductoService {

    public List<Producto> findAll();

    public Producto findById(Long id);

    public Producto save(Producto producto);

    public void delete(Producto producto);

    public void deleteById(Long id);
}