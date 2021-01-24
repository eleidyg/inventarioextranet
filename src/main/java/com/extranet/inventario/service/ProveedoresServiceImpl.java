package com.extranet.inventario.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.extranet.inventario.dao.ProveedoresDao;
import com.extranet.inventario.model.Proveedor;
import com.extranet.inventario.model.service.IProveedorService;

@Repository
public class ProveedoresServiceImpl implements IProveedorService{
	
	@Autowired
	private ProveedoresDao dao;

	@Override
	public Proveedor registrar(Proveedor t) {
		return dao.save(t);
	}

	@Override
	public Proveedor modificar(Proveedor t) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void eliminar(int d) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Proveedor listarId(int d) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Proveedor> listar() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
