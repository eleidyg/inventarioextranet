package com.extranet.inventario.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.extranet.inventario.dao.ProveedoresDao;
import com.extranet.inventario.dao.TipoProveedorDao;
import com.extranet.inventario.model.Proveedor;
import com.extranet.inventario.model.TipoProveedor;
import com.extranet.inventario.model.service.ITipoProveedor;

@Repository
public class TipoProveedorServiceImpl implements ITipoProveedor{
	
	@Autowired
	private TipoProveedorDao dao;

	@Override
	public TipoProveedor registrar(TipoProveedor t) {
		return dao.save(t);
		
	}

	@Override
	public TipoProveedor modificar(TipoProveedor t) {
		return null;
	}

	@Override
	public void eliminar(int d) {
		
	}

	@Override
	public TipoProveedor listarId(int d) {
		return null;
	}

	@Override
	public List<TipoProveedor> listar() {
		return dao.findAll();
	}
	
	
}
