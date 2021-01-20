package com.extranet.inventario.service;

import com.extranet.inventario.model.TipoProveedor;

public interface TipoProveedorService {
	
	void saveTipoProveedor(TipoProveedor tipoProveedor);
	
	TipoProveedor findById(Integer idTipoProveedor);
	
	TipoProveedor findByNombreTipoProveedor(String nombreTipoProveedor);

}
