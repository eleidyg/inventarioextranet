package com.extranet.inventario.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.extranet.inventario.model.Proveedor;

public interface ProveedoresDao extends JpaRepository<Proveedor, Integer>{
	
	

}
