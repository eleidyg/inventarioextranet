package com.extranet.inventario.dao;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.extranet.inventario.model.Proveedor;

@Repository
public class ProveedoresDaoImpl implements ProveedoresDao{
	
	@Autowired
	ProveedoresJpaSpring proveedorJpa;

	@Override
	public void saveProveedor(Proveedor proveedor) {
		proveedorJpa.save(proveedor);
	}
	
	@Override
	public Proveedor findByNombre(String nombre) {
		return proveedorJpa.findByNombre(nombre);
	}
}
