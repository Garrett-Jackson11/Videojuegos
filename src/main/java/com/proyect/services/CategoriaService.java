/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.proyect.services;

import com.proyect.domain.Categoria;
import java.util.List;

/**
 *
 * @author jacgo
 */
public interface CategoriaService {

    public List<Categoria> getCategorias(boolean activo);

    // Se obtiene un Categoria, a partir del id de un categoria
    public Categoria getCategoria(Categoria categoria);

    // Se inserta un nuevo categoria si el id del categoria esta vacÃ­o
    // Se actualiza un categoria si el id del categoria NO esta vacÃ­o
    public void save(Categoria categoria);

    // Se elimina el categoria que tiene el id pasado por parÃ¡metro
    public void delete(Categoria categoria);
}
