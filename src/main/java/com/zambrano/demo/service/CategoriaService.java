/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.zambrano.demo.service;

import com.zambrano.demo.entity.Categoria;
import java.util.List;

public interface CategoriaService {

    public List<Categoria> findAll();

    public Categoria findById(Long id);

    public Categoria save(Categoria categoria);

    public void delete(Categoria categoria);

    public void deleteById(Long id);
}
