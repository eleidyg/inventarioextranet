package com.extranet.inventario.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.extranet.inventario.model.TipoProveedor;

public interface TipoProveedorDao extends JpaRepository<TipoProveedor, Integer>{
	
	String query="SELECT idtipo_proveedor,nombre_tipo_proveedor FROM tipo_proveedor";
	@Query(value = query, nativeQuery = true)
	List<TipoProveedor> consultarTipoProveedor();

}
