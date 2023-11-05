/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.proyect.dao;

import com.proyect.domain.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author jacgo
 */
public interface CategoriaDao extends JpaRepository<Categoria, Long>{
    
}
