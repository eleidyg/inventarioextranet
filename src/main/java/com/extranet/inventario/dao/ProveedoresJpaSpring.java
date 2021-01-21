package com.extranet.inventario.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.extranet.inventario.model.Proveedor;

public interface ProveedoresJpaSpring extends JpaRepository<Proveedor, Integer>{
	Proveedor findByNombre(String nombre);
}
