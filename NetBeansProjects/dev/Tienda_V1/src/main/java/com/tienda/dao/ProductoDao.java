package com.tienda.dao;

import com.tienda.domain.Producto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ProductoDao extends JpaRepository<Producto, Long> {

    public List<Producto> findByPrecioBetweenOrderByDescripcion(double precioInf, double precioSup); //query 1 de consultadas ampliadas (sencillas)

    //Ejemplo de método utilizando Consultas con JPQL
    @Query(value = "SELECT a FROM Producto a where a.precio BETWEEN :precioInf AND :precioSup ORDER BY a.descripcion ASC")
    public List<Producto> metodoJPQL(@Param("precioInf") double precioInf, @Param("precioSup") double precioSup);

    //Ejemplo de método utilizando Consultas con SQL nativo
    @Query(nativeQuery = true,
            value = "SELECT * FROM producto where producto.precio BETWEEN :precioInf AND :precioSup ORDER BY producto.descripcion ASC")
    public List<Producto> metodoNativo(@Param("precioInf") double precioInf, @Param("precioSup") double precioSup);

    @Query(nativeQuery = true,
            value = "SELECT * FROM producto where producto.existencias <= :cantidad ORDER BY producto.descripcion ASC")
    public List<Producto> metodoTarea(@Param("cantidad") int cantidad);
}