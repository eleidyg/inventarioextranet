package com.extranet.inventario.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.extranet.inventario.model.Proveedor;

public interface ProveedoresDao extends JpaRepository<Proveedor, Integer>{
	
	String query="SELECT nombre FROM proveedor where nombre LIKE %:nombre%";
	@Query(value = query, nativeQuery = true)
	List<String> consultarTipoProveedorNombre(@Param("nombre") String nombreNegociacion);

}
