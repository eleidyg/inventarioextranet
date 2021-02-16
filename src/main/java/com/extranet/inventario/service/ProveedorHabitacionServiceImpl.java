package com.extranet.inventario.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.extranet.inventario.dao.ProveedorHabitacionDao;
import com.extranet.inventario.model.ProveedorHabitacion;
import com.extranet.inventario.model.service.IProveedorHabitacion;
import com.extranet.inventario.model.service.IProveedorService;

@Repository
public class ProveedorHabitacionServiceImpl implements IProveedorHabitacion{
	
	@Autowired
	private ProveedorHabitacionDao dao;

	@Override
	public ProveedorHabitacion registrar(ProveedorHabitacion t) {
		return dao.save(t);
	}

	@Override
	public ProveedorHabitacion modificar(ProveedorHabitacion t) {
		return null;
	}

	@Override
	public void eliminar(int d) {
		
		
	}

	@Override
	public ProveedorHabitacion listarId(int d) {
		
		return null;
	}

	@Override
	public List<ProveedorHabitacion> listar() {
		
		return null;
	}

}
