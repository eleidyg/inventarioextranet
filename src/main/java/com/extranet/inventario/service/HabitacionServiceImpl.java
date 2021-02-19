package com.extranet.inventario.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.extranet.inventario.dao.HabitacionDao;
import com.extranet.inventario.dao.TipoHabitacionDao;
import com.extranet.inventario.model.Habitacion;
import com.extranet.inventario.model.service.IHabitacionService;

@Repository
public class HabitacionServiceImpl implements IHabitacionService{
	
	@Autowired
	private HabitacionDao dao;
	
	@Override
	public Habitacion registrar(Habitacion t) {
		return dao.save(t);
	}

	@Override
	public Habitacion modificar(Habitacion t) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void eliminar(int d) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Habitacion listarId(int d) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Habitacion> listar() {
		return dao.findAll();
	}

}
