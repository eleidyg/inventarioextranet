package com.extranet.inventario.dao;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.extranet.inventario.model.Proveedor;
import com.extranet.inventario.model.TipoProveedor;

@Repository
public class TipoProveedorDaoImpl implements TipoProveedorDao{
	
	@Autowired
	TipoProveedoresJpaSpring tipoProveedorJpa;
	
	@Override
	public void saveTipoProveedor(TipoProveedor tipoProveedor) {
		// TODO Auto-generated method stub
		tipoProveedorJpa.save(tipoProveedor);
	}
	
	@Override
	public TipoProveedor findById(Integer idTipoProveedor) {
		// TODO Auto-generated method stub
		return tipoProveedorJpa.findById(idTipoProveedor).orElse(null);
		
	}
	
	@Override
	public TipoProveedor findByNombreTipoProveedor(String nombreTipoProveedor) {
		// TODO Auto-generated method stub
		return tipoProveedorJpa.findByNombreTipoProveedor(nombreTipoProveedor);
	}

}
