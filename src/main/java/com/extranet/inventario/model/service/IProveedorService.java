package com.extranet.inventario.model.service;

import java.util.List;

import com.extranet.inventario.model.Proveedor;

public interface IProveedorService extends ICRUD<Proveedor>{
	
	List<String> listarNombreProveedor(String nombreNegociacion);

}
