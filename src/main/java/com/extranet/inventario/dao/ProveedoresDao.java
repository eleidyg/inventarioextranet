package com.extranet.inventario.dao;

import com.extranet.inventario.model.Proveedor;

public interface ProveedoresDao {
	
	void saveProveedor(Proveedor proveedor);
	
	Proveedor findByNombre(String nombre);

}
