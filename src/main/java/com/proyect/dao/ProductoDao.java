/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.proyect.dao;

import com.proyect.domain.Producto;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author jacgo
 */
public interface ProductoDao extends JpaRepository<Producto, Long>{
    //Lista de productos utilizando un metodo Query
    public List<Producto> findByPrecioBetweenOrderByDescripcion(double precioInf, double precioSup);
}
