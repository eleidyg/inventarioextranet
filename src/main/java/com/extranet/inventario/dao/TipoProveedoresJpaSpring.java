package com.extranet.inventario.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.extranet.inventario.model.TipoProveedor;

public interface TipoProveedoresJpaSpring extends JpaRepository<TipoProveedor,Integer>{
	TipoProveedor findByNombreTipoProveedor(String nombreTipoProveedor);
}
