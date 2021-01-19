package com.extranet.inventario.dao;

import com.extranet.inventario.model.TipoProveedor;

public interface TipoProveedorDao {
	
	void saveTipoProveedor(TipoProveedor tipoProveedor);
	
	TipoProveedor findById(Long idTipoProveedor);

}
